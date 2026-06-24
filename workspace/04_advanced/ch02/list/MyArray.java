package ch02.list;

/**
 * 배열의 불편한 점은 다음과 같다.
 * 생성시 길이를 지정해야 함.
 * 생성된 배열의 길이는 수정 못함.
 * 요소 추가, 삭제, 삽입이 어려움.
 * 이러한 불편한 점을 개선하여 배열을 쓰기 쉽게 만드는 클래스
 */

public class MyArray<T> implements MyList<T> {

    /**
     * 내부적으로 요소를 저장하는 배열 선언
     */
    private Object[] data;

    /**
     * 배열에 실제 담겨있는 요소의 갯수
     */
    private int count;

    /**
     * 기본 생성자
     * 배열의 크기를 10개로 지정한다.
     */
    public MyArray(){
        this(10);
    }

    /**
     * 초기 배열의 크기를 지정한 size로 생성한다.
     * @param size 배열의 초기 크기
     */
    public MyArray(int size) {
        data = new Object[size]; // data 대신 this.data 라고 써도 된다.
    }

    /**
     * 배열의 마지막 위치에 지정한 elem를 추가한다.
     * @param elem 배열에 추가할 요소
     */
    public void add(T elem){
        add(count, elem);
    }

    /**
     * 배열의 index에 elem를 삽입한다.
     * @param index 삽입할 위치
     * @param elem 삽입할 요소
     */
        public void add(int index, T elem){
            if(index < 0){
                throw new ArrayIndexOutOfBoundsException(index + " < 0");
            }else if(index > count){
                throw new ArrayIndexOutOfBoundsException(index + " > " + count);
            } // 인덱스 범위 예외 처리(Validation) 삽입하려는 위치(index)가 올바른 범위 내 있는지 확인

            if(count >= data.length){ // 내부 배열의 공간이 다 찼을 경우 배열의 크기를 늘린다. (1.5배) // 배열 공간 확장 (Dynamic Resizing) // 조건 확인: 현재 배열에 저장된 데이터 수(count)가 배열의 실제 물리적 크기(data.length) 와 같아지면 방이 가득찬 상태.
                Object[] temp = new Object[data.length + data.length / 2];
                for(int i=0; i<data.length; i++){ // 새 배열 생성: 기존 크기의 1.5배 (data.length + data.length / 2) 크기를 가진 새로운 임시 배열 temp를 만듭니다.
                    temp[i] = data[i];
                } // 데이터 복사: 기존 data 배열에 있던 요소들을 루프를 돌며 temp 배열로 하나씩 복사합니다.
                System.out.println(data.length + " -> " + temp.length);
                data = temp; // 참조 변경: 크기가 늘어난 temp 배열을 다시 data 변수에 할당하여, 앞으로 이 더 큰 배열을 사용하도록 합니다.
            }

            // index부터 끝까지 하나씩 뒤로 미는 작업
            System.arraycopy(data, index, data, index+1, count-index);
            data[index] = elem;
            count++; // 데이터 밀어내기 및 삽입 (Shifting & Insertion) // 자바의 고속 배열 복사 메서드인 System.arraycopy를 사용해 이를 효율적으로 처리합니다.  // data 배열의 index 위치부터 시작해서, 총 count - index 개의 데이터를, 동일한 배열의 index + 1 위치로 한 칸씩 복사(이동)합니다.
        }

    /**
     * 지정한 index의 요소를 삭제한다.
     * @param index
     */
    public void remove (int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        }else if(index < 0){
            throw new ArrayIndexOutOfBoundsException(index + " < 0");
        }

        // index부터 끝까지 하나씩 앞으로 당기는 작업 // data 배열의 index + 1 위치부터 데이터를 읽어서 동일한 data 배열의 index 위치에 덮어씁니다. 복사할 데이터의 총 갯수는 count-index-1 개입니다.
        System.arraycopy(data, index+1, data, index, count-index-1);
        count--; // 데이터가 하나 삭제되었으므로 전체 데이터 개수를 1 감소시킵니다.
        data[count] = null; // data[count] = null: 데이터를 앞으로 한 칸씩 당겼기 때문에, 배열의 맨 마지막 칸(기존 count-1번지)에는 밀기 전의 데이터가 그대로 남아있게 됩니다.
        } // 이를 그대로 두면 쓰레기 데이터(Garbage)가 남거나 메모리 누수(Memory Leak)가 발생할 수 있으므로, null을 대입하여 깨끗하게 지워줍니다.

    /**
     * 지정한 위치의 데이터를 반환한다.
     * @param index 반환할 데이터의 위치
     * @return 지정한 위치의 데이터
     */
    public T get(int index){ // getElem: "방 번호 줄 테니까 거기 있는 데이터 꺼내줘"라는 요청을 처리합니다. 없는 방 번호를 대면 에러를 냅니다.
            if(index >= count){
                throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
            }else if(index < 0){
                throw new ArrayIndexOutOfBoundsException(index + " < 0");
            }
            return (T)data[index]; // 실제 내부 배열(data)의 해당 인덱스에 저장되어 있는 데이터를 그대로 반환합니다.
        }

        public int size(){ // 현재 리스트에 실제로 몇 개의 데이터가 저장되어 있는지를 알려주는 메서드 // size: "지금 데이터 몇 개 저장되어 있어?"라는 질문에 현재 개수(count)를 답해줍
            return this.count; // 내부 배열의 전체 크기(data.length)가 아니라, 사용자가 실제로 추가해서 유효하게 들어있는 데이터의 개수(this.count)를 반환
            } // 외부에 내부 변수인 count를 직접 노출하지 않고, 메서드를 통해 안전하게 값을 가져오도록 하는 캡슐화(Encapsulation)의 좋은 예시

        @Override
        public String toString(){ // 리스트 객체를 출력하거나 문자열로 변환할 때, 내부에 저장된 데이터들을 예쁘게 포맷팅(예: [A, B, C])해서 보여주는 toString() 메서드
//        StringBuffer str = new StringBuffer("["); // 멀티 스레드 환경에서 사용
        StringBuilder str = new StringBuilder("["); // 싱글 스레드 환경에서 사용

//            return Arrays.toString(data); // toString 은 배열의 모든 값을 나타낸다.
//            String str = "[";

            if(count > 0){
                str.append(data[0]); // 리스트에 데이터가 하나라도 들어있다면(count > 0), 맨 처음 대괄호([) 바로 뒤에 첫 번째 데이터(data[0])를 붙입니다. 데이터가 아예 없다면 이 조건문을 건너뛰므로 빈 배열일 때 [] 형태로 깔끔하게 출력되도록 돕습니다.
            }

            for(int i=1; i<count; i++){ // 인덱스 1부터 시작: 첫 번째 데이터는 이미 넣었으므로, 인덱스 1부터 실제 데이터 개수인 count - 1까지 반복문을 돕니다.
                str.append(", ").append(data[i]); // 쉼표 , 처리: 두 번째 데이터부터는 앞에 콤마와 공백(, )을 먼저 붙인 뒤 데이터를 추가합니다.
            } // count 까지만 도는 이유 (중요): 주석 처리된 Arrays.toString(data)는 실제 배열의 전체 크기(data.length)만큼 출력하기 때문에 뒤쪽에 남은 빈 공간(null)까지 다 보여주게 됩니다. 하지만 이 반복문은 딱 유효한 데이터 개수(count)만큼만 돌기 때문에 깔끔하게 실제 저장된 데이터만 보여줍니다.
            str.append("]"); // 마지막에 닫는 대괄호(])를 붙여서 형태를 완성합니다.

            return str.toString(); // 조립이 완료된 StringBuilder 객체를 일반 문자열(String)로 변환하여 반환합니다.
        }

}

// 왜 일반 String 대신 사용할까요? 일반 String에 + 연산자로 문자열을 계속 더하면 매번 새로운 문자열 객체가 생성되어 메모리가 낭비됩니다. 반면 StringBuilder는 내부 버퍼를 사용해 문자열을 효율적으로 이어 붙입니다.
// 이 메서드는 배열의 물리적인 빈 공간(null)을 숨기고, 사용자가 저장한 실제 데이터들만 골라 [값1, 값2, 값3] 형태로 예쁘게 문자열을 만들어주는 효율적인 포맷팅 함수입니다.
