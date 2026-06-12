package ch08;

import java.util.Scanner;

// 계산기
// 5 + 4 -> 5 + 4 = 9
// 4 * 2 -> 4 * 2 = 8
public class CalculatorTest {
    public static void main (String[] args) {
        System.out.println("*** 계산기 프로그램 ***");
        System.out.println("계산식을 입력하세요. (예시, 5 + 4)");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt(); // 5
        String operator = s.next(); // "+"
        int num2 = s.nextInt(); // 4

        String result = switch(operator) {
            case "+" -> num1 + " " + operator + " " + num2 + " = " + (num1 + num2);
            case "-" -> num1 + " " + operator + " " + num2 + " = " + (num1 - num2);
            case "*" -> num1 + " " + operator + " " + num2 + " = " + (num1 * num2);
            case "/" -> num1 + " " + operator + " " + num2 + " = " + ((double)num1 / num2);
            default -> "수식에 오류가 있습니다.";

        };

        System.out.println(result);

    }
}

// 결과값 나오는 창 두번째 줄에 예시처럼 작성 후 엔터키 눌러야 결과값 출력됨
// 4 % 2 입력하면 default 값 출력됨
// ((double) num1 / num2) -> double 형태로 출력 2.33333 , ((double) (num1 / num2)) -> int 형태에서 소수로 변환되어 출력 2.0 (Q&A)
