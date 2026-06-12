package ch08;

// 1부터 지정한 수까지의 함계를 구하시오.
public class WhileTest {
    public static void main(String[] args) {
        // 명령행 매개변수
        // java ch08.WhileTest "10" "20"
        // args[0] -> 10
        // args[1] -> 20
        int num = Integer.parseInt(args[0]); // String 을 int 로 변환
        int i = 1; // i 초기화     1, 2, 3, 4, ...
        int sum = 0;



        // 반복문 없이 구현
//        sum = sum + i; // 0 + 1
//        System.out.println("i + " + i + ", sum: " + sum); // i = 1, sum: 1
//        i++; // 2
//
//        sum = sum + i; // 1 + 2
//        System.out.println("i + " + i + ", sum: " + sum); // i = 2, sum: 3
//        i++; // 3
//
//        sum += i; // sum = sum + i; ; 1 + 2 + 3
//        System.out.println("i + " + i + ", sum: " + sum); // i = 3, sum: 6
//        i++; // 4
//
//        sum += i; // 1 + 2 + 3 + 4
//        System.out.println("i + " + i + ", sum: " + sum); // i = 4, sum: 10
//        i++; // 5
//
//        sum += i; // 1 + 2 + 3 + 4 + 5
//        System.out.println("i + " + i + ", sum: " + sum); // i = 5, sum: 15
//        i++; // 6


        while (i <= num) { // 조건문
            sum += i;
            System.out.println("i: " + i + ", sum: " + sum);
            i++;          // i 증감식
        }


        System.out.println("1부터 " + num + "까지의 합계: " + sum);
    }
}



// 1번) int i = 1; (11번째 줄, 초기화)
// 2번) i <= num (14번째 줄 while문 괄호 안의 조건식)
// 3번) i++; (17번째 줄, 증감식)
// 4번) sum += i;
//      System.out.println("i: " + i + ", sum: " + sum);
// 작동 순서 1 > 2 > 4 > 3 >>> 2 > 4 > 3 >>> 2 > 4 > 3 >>> 반복하다가 i=10 인 경우까지 작동한 후 완료

// while(조건식) {}
// while 은 무한루프 가능, 횟수가 아닌 다른 조건이 필요

// args[0] 처럼 [] 안에 숫자가 있는데 10으로 설정하려면 우측 상단 Run 연두색 화살표 왼쪽의 V 표 클릭 - 해당 클래스명 - 점 세 개 - edit - Program arguments 항목에 10 입력
