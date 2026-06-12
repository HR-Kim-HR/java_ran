package ch08;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 사용자가 입력한 데이터를 받을 때 사용
        int dan = s.nextInt(); // 입력한 값을 int로 꺼내옴
        System.out.println("입력한 값: " + dan);

        for(int i=1; i<=9; i++){
            System.out.println(dan + " x " + i + " = " + (dan*i));

        }

    }
}

// 구구단 실행되도록 만든 것
// Run 실행 후 결과값 나오는 창 두번째 줄에 숫자 하나 입력 후 엔터키 눌러야 결과값 출력, 2 누르면 2단 출력, 3 누르면 3단 출력