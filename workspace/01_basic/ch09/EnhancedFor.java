package ch09;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] scores = {90, 80, 75}; // 3과목
//        int[] scores = {100, 80, 70, 88}; // 4과목

        int sum = 0; // 총점
        double avg = 0; // 평균

//        // 과목 수와 상관없이 총점과 평균을 계산하세요. (과목수가 달라져도 이 코드는 수정하지 않습니다.)
//
//       sum += scores[0];
//       sum += scores[1];
//       sum += scores[2];
//       sum += scores[3];

        // 일반 for 구문
//       for(int i=0; i<scores.length; i++) {
//            int score = scores[i];
//            sum += score;
//       }

        // Enhanced for loop (향상된 for 구문)  // 처음부터 끝까지 순회하면서 하나하나 꺼내어 작업. 기존 변수값 수정은 불가능. 중간부터 꺼내쓰거나 거꾸로 꺼내쓰는 것은 불가능.
        for(int score : scores){ // int score = scores[i];      // -> 위의 일반 for문보다 현업에서 자주 활용하는 형태
            sum += score;
        }

        avg = (double)sum / scores.length;       // length 는 갯수이므로 평균을 구할 때 length 로 나눈다!

       System.out.println("총점: " + sum);
       System.out.println("평균: " + avg);

    }
}

//        나의 시도
//        for(int i=0; i<scores.length; i++) {
//
//        }
//
//        for(int i=0; i<(scores.length)/i;i++) {
//
//        }


// for 문은 배열과 함께 사용하는 경우가 많음
// for 문은 주로 미만 (<) 을 사용