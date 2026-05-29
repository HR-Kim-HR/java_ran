package ch08;

import org.w3c.dom.ls.LSOutput;

public class ForTest5 {
    public static void main(String[] args) {
//        star1(); // star1 이라는 명령어를 호출해라! 여러 메소드로 나누고 필요할 때 해당 메소드 호출해서 실행! 메소드는 다음주에 배울 예정.
        star2();
//        star3();
//        star4();
    }

    // *
    // **
    // ***
    // ****
    // *****

    static void star1() {

        for (int i = 0; i < 1; i++) {
            System.out.print("*"); // *
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print("*"); // **
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("*"); // ***
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print("*"); // ****
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("*"); // *****
        }
        System.out.println();

    }

    // *
    // **
    // ***
    // ...
    // **...** 50개

    static void star2 () {
        // 중첩 for문   바깥쪽 for: 행수, 안쪽 for: 열수
        for(int i=0; i<10; i++) {
            for (int k = 0; k < i+1 ; k++) {
                    System.out.print("*"); // *
            }
            System.out.println();
        }

        // i = 0, k = 0, *
        // i = 1, k = 0, 1 **
        // i = 2, k = 0, 1, 2 ***
        // i = 3, k = 0, 1, 2, 3 ****
        // i = 4, k = 0, 1, 2, 3, 4 *****
        // i 는 행, k 는 열 (별의 갯수)
    }

    // *****   i = 0, k < 5
    // ****    i = 1, k < 4
    // ***     i = 2, k < 3
    // **      i = 3, k < 2
    // *       i = 4, k < 1

    static void star3 () {
        for(int i=0; i<5; i++) {
            for (int k = 0; k < 5-i; k++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    //     *   i = 0, k < 4
    //    **   i = 1, k < 3
    //   ***   i = 2, k < 2
    //  ****   i = 3, k < 1
    // *****   i = 4, k < 0

    static void star4 () {
        for(int i=0; i<5; i++) {
            for (int k = 0; k < (5-1-i) ; k++) {
                    System.out.print(" ");
            }
            for (int k = 0; k < i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// 한 줄씩 주석에 번호 하나씩 붙여서 코드 순서 흐름 이해하면서 복습! (용쌤 꿀팁)
// AI 에게 코드 만들어 달라고 하지 말고 내가 만든 코드를 이해할 수 있도록 설명해 달라고 요청!
// print 는 옆으로 쭈욱 출력, println 은 라인별로 줄 바꾸어 출력