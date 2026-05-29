package ch09;

// 국어, 영어, 수학 점수를 이용해서 총점과 평균을 계산
public class ScoreArrayTest {
    public static void main(String[] args) {

          // 1. 배열 선언, 생성, 초기화를 각각
//        int[] haruScore; // 1-1. 배열 선언
//        haruScore = new int[3]; // 1-2. 배열 생성 (갯수 지정), 12byte의 메모리(힙) 할당하고 그 주소를 반환, 3개니까 3 입력, 10개면 10 입력, int 니까 정수 형태만 담을 수 있음

          // 2. 배열 선언과 생성을 동시에
//        int[] haruScore = new int[3];   // 2-1. 선언과 생성

//        haruScore[0] = 100; // 1-3, 2-2. 배열 요소 초기화 (index를 이용해서 배열에 접근)
//        haruScore[1] = 90;
//        haruScore[2] = 85;

        // 3. 배열 선언, 생성, 초기화를 동시에 -> 세번째 방식이 가장 깔끔하고 간결하다
//        int[] haruScore = new int[]{100, 90, 85};
        int[] haruScore = {100, 90, 85};

        System.out.println("국어: " + haruScore[0]); // 100
        System.out.println("영어: " + haruScore[1]); // 90
        System.out.println("수학: " + haruScore[2]); // 85

        int sum = haruScore[0] + haruScore[1] + haruScore[2]; // 총점
        double avg = sum / 3.0; //평균 91.66666

//        avg = Math.round(avg); // 소수 첫째자리 반올림, 92.0                  // round 자체가 반올림
//        avg = Math.round(avg * 10) / 10.0; // 소수 둘째자리 반올림, 91.7
//        avg = Math.round(avg * 100) / 100.0; // 소수 셋째자리 반올림, 91.67

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);

    }
}

// double avg = sum / 3; -> 91.0
// double avg = sum / 3.0; -> 91.66666666666667
// double avg = Math.round(sum / 3.0); -> 92.0 (반올림)

// 메소드 내부에서 생성된 변수 haruScore 는 stack 영역에 만들어진다.
// haruScore 에는 값이 있는 주소가 쓰여있다. 주소의 위치는 heap 영역에 있어서 거기로 가서 해당하는 변수의 실제 값을 찾아오는 형태.
// sum, avg 는 기본 타입이므로 변수값 그대로 Stack 영역에 저장, haruScore 는 참조형 타입이므로 Stack 영역에 값이 있는 주소만 저장