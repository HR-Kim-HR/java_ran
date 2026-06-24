package ch02.list; // LinkedList 는 Array 와 구조가 다르다. 장단점 뚜렷.

public class MyLinkedList implements MyList {
    // inner 클래스 정의
    private class Node { // count 변수가 "현재 창고에 들어있는 상자의 갯수", data 는 "상자들이 차곡차곡 쌓여있는 진짜 공간"
        /**
         *  저장할 객체
         */
        private Object data; //private 클래스 내부에서만 직접 접근 가능(캡슐화) // Object 는 모든 클래스의 최상위 부모 클래스. 문자, 정수, 객체 등 제한 없이 모두 담을 수 있는 만능 바구니

        /**
         * 연결된 다음 노드를 창조하는 변수
         */ // 배열 기반 구조(ArrayList)와는 완전히 다른, 연결 리스트(Linked List)라는 자료구조에서 사용되는 노드(Node) 객체의 핵심 코드
        private Node nextNode; // 역할: 현재 노드(기차 칸) 기준으로 "바로 다음에 연결될 노드(기차 칸)가 어디인지" 그 주소를 가리키는 포인터(연결 고리) // 이 변수 덕분에 노드들이 기차 객차(체인)처럼 일렬로 쭉 연결 가능

        Node(Object data){ // 생성자: 새로운 노드(새 기차 칸)를 처음 만들 때 호출되는 생성자 함수
            this.data = data; // 외부에서 넘겨받은 실제 데이터(Object data)를 이 노드의 데이터 보관함(this.data)에 저장
            this.nextNode = null; // 새로 만들어진 노드는 아직 뒤에 연결할 다음 칸이 정해지지 않았으므로 다음을 가리키는 고리(nextNode)를 아무 것도 없다는 뜻의 null로 초기화. 나중에 다른 데이터 추가되면 이 null 자리에 새 노드의 주소 채워지면서 연결됨
        } // 배열(Array) 기반 리스트는 data[index] 구조 사용했기에, 방 크기를 늘리거나 데이터 밀고 당기는 작업 필요하지만, 연결리스트(Linked List) 기반은 불필요.
    } // 연결리스트(Linked List) 기반은 각 데이터가 다음 데이터의 위치를 기억하는 방식. 데이터를 중간에 삽입/삭제할 때 데이터를 밀 필요 없이 nextNode 고리만 살짝 바꿔 끼우면 되기에 아주 효율적

    /** //연결 리스트는 배열과 달리 인덱스(방 번호)가 없어서 메모리에 여기저기 흩어져 있음. "첫번째 노드가 어디 있는지" 가 중요.
     * 첫번째 노드
     */ // header 가 바로 그 첫번째 노드의 주소를 기억하는 나침반 역할
    private Node header; // header 1) 실제 첫 번째 데이터 가리키는 경우 비어있으면 header = null; 데이터 추가되면 header 가 첫번째 노드 직접 가리킴 // header 2) Dummy (더미) 노드를 가리키는 경우 리스트를 처음 만들 때 아무 데이터도 없는 빈노드를 하나 만들어 header 에 넣어둠. 실제 데이터는 header.nextNode 부터 시작.
    /** // header는 연결 리스트의 처음과 끝을 관장하는 '시작 포인터'입니다.
     * 전체 요소의 수
     */
    private int size; // private(캡슐화): 외부에서 list.size = -100; 처럼 숫자를 마음대로 조작해 실제 노드 개수와 불일치하는 버그가 생기지 않도록 접근을 차단 // 외부에서 개수를 안전하게 읽어갈 수 있도록 public int size() { return this.size; } 같은 메서드(Getter)를 제공

    public MyLinkedList(){ // 연결 리스트 클래스의 생성자 메서드
        header = new Node(null); // new Node(null) : 데이터 공간(data)이 null 로 비어있는 가짜 노드(Dummy Node)를 하나 생성함.
    } // header = ... : 라스트의 시작점인 header 변수가 이 가짜 노드를 가리키도록 설정. 리스트를 처음 만들면 비어있는 상태임에도 불구하고 내부적으로는 머리 역할을 하는 기본 노드가 무조건 하나 존재하는 상태로 시작.

    /**
     * Data 를 첫번째 요소로 추가한다.
     * @param data 추가할 요소
     */
    public void addFirst(Object data){
        Node node = new Node(data);
        // 헤더가 가리키고 있는 첫번째 노드의 주소를 삽입한 노드의 nextNode로 지정
        node.nextNode = header.nextNode;
        // 헤더의 첫번째 노드를 새로 생성한 노드로 지정
        header.nextNode = node;
        size++;
    }

    /**
     * data를 index 위치에 삽입한다.
     * @param index data가 삽입될 위치
     * @param data 삽입할 데이터
     */
    public void add(int index, Object data){
        if(index == 0) {
            addFirst(data);
        }else {
            Node newNode = new Node(data); // 추가할 새로운 노드
            Node pNode = getNode(index-1);
            Node nNode = pNode.nextNode;
            newNode.nextNode = nNode;
            pNode.nextNode = newNode;
            size++;
        }
    }

    /**
     * data를 리스트의 마지막에 추가한다.
     * @param data 추가할 데이터
     */
    public void add(Object data){
        add(size, data);
    }

    /**
     * 리스트의 첫번째 요소를 삭제한다.
     */
    private void removeFirst() {
        // 첫번째 노드의 다음 노드를 첫번째 노드로 지정하고
        Node firstNode = header.nextNode;
        header.nextNode = firstNode.nextNode;
        // 첫번째 노드의 데이터를 반환한 후 사이즈 감소
        size--;
    }

    /**
     * 지정한 index 요소를 삭제한다.
     * @param index 삭제한 요소의 index
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else if (index == 0) {
            removeFirst();
        }

        Node pNode = getNode(index-1); // 삭제할 노드의 이전 노드
        Node rNode = pNode.nextNode; // 삭제할 노드
        Node nNode = rNode.nextNode; // 삭제할 노드의 다음 노드

        pNode.nextNode = nNode;
        size--;
    }

    /**
     * 지정한 index의 요소를 반환한다.
     * @param index 요소의 index
     * @return index 위치의 요소가 반환된다.
     */
    public Object get(int index) {
        return getNode(index).data;
    }

    /**
     * 전체 요소의 수를 반환
     * @return 전체 요소의 수
     */
    public int size(){
        return this.size;
    }

    public String toString() {
        StringBuffer result = new StringBuffer("[");
        Node node = header.nextNode;
        if (node != null) {
            result.append(node.data);
            node = node.nextNode;
            while (node != null) {
                result.append(", ");
                result.append(node.data);
                node = node.nextNode;
            }
        }
        result.append("]");
        return result.toString();
    }

    /**
     * index 위치의 Node를 찾아서 반환한다.
     * @param index 찾을 index
     * @return 찾아낸 Node
     */
    private Node getNode(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node node = header.nextNode;
        for(int i = 0; i < index; i++){
            node = node.nextNode;
        }
        return node;
    }
}
