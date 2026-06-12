package ch09;

public class ArrayMemory {

    public static void main (String[] args) {
        int age = 25; // 기본 타입
        int[] scores = new int[3]; // 참조 타입

        scores[0] = 90;

        System.out.println(age);
        System.out.println(scores);
        System.out.println(scores[0]);
    }
}

// stack 영역 아래부터 age = 25 , scores 에는 주소
// heap 영역은 stack 처럼 정리 되어 있는 게 아니라 랜덤, 무작위로 공간 할당하는 영역, 객체나 배열이 저장됨
// System.out.println(scores); 를 실행해보면 [I@f6f4d33 로 출력되는데 데이터의 주소값이라고 생각하면 됨
