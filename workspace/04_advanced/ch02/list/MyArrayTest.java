package ch02.list;

public class MyArrayTest {
    void main(){
        // 10개의 요소를 담을 수 있는 MyArray 객체를 생성한다.
//        MyArray arr = new MyArray();
        MyList<String> arr = new MyArray(5);

        // 데이터 400개까지 삽입해야 할 경우, 하드코딩할 수 없으므로 for 문 활용
        for(int i=0; i<500; i++){
            arr.add("DaTa-" + i);
        }

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1, 데이터-2, 데이터-3, 데이터-4]
        System.out.println(arr);

        // MyArray의 0번째 요소를 출력한다. 데이터-0
        System.out.println(((String)arr.get(0)).toLowerCase());

        // MyArray의 3번째 요소를 출력한다. 데이터-3
        System.out.println(arr.get(3).toUpperCase());

        // index 2를 삭제한다. 데이터-2 -> ' arr.메서드명' 잊고 있었네...
        arr.remove(2);

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1, 데이터-3, 데이터-4]
        System.out.println(arr);

        // index 2에 데이터-5를 삽입한다. -> ' arr.메서드명' 잊고 있었네...
        arr.add(2,"데이터-5");

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1, 데이터-5, 데이터-3, 데이터-4]
        System.out.println(arr);

        // 마지막 위치에 데이터-6을 추가한다. ' arr.메서드명' 잊고 있었네...
        arr.add("데이터-6");

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1, 데이터-5, 데이터-3, 데이터-4, 데이터-6]
        System.out.println(arr);

        // MyArray에 담긴 요소의 갯수를 출력한다. -> 추가 문제 -> public int size(){ return this.count;} 추가해서 활용
        System.out.println("갯수: " + arr.size());



        // 수업 시간 내용 -> 새로운 배열 선언은 아래 둘 중 하나만 활성화!
//        MyArray arr = new MyArray();
//        MyArray arr = new MyArray(5);
//
//        arr.append(10);
//        arr.append(20);
//        arr.append(30);
//        arr.append(40);
//        arr.append(50);
//        arr.append(2, 25);
//        arr.delete(1);
//
//        System.out.println("2번 인덱스 값: " + arr.getElem(2));
//
//        System.out.println("4번 인덱스 값: " + arr.getElem(4));
//
//        System.out.println(arr);
    }
}
