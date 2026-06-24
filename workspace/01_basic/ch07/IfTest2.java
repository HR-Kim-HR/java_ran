package ch07;

import java.sql.SQLOutput;

// 입력받은 월(month)의 마지막 날짜를 출력하세요. (윤달은 계산하지 않음)
public class IfTest2 {
    public static void main(String[] args) {
        int month = 1;

        // 복습

        if(month == 4 || month == 6 || month == 9 || month == 11 ) {
            System.out.println(month + "월의 마지막 날은 30일입니다.");
        } else if (month == 2) {
            System.out.println(month + "월의 마지막 날은 28일입니다.");
        } else {
            System.out.println(month + "월의 마지막 날은 31일입니다.");
        }

        // 수업

        if (month < 1 || month > 12){
            System.out.println("1~12 사이의 숫자만 가능합니다.");
//            System.exit(0); // 프로그램 강제 종료 : 서버 다운이라서 현업에서는 절대 사용 금지!!! 0만 입력하면 자동입력됨
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(month + "월의 마지막 날은 30일입니다.");
        } else if (month == 2) {
            System.out.println("2월의 마지막 날은 28일 입니다.");
        } else  {
            System.out.println(month + "월의 마지막 날은 31일 입니다.");


//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            System.out.println(month + "월의 마지막 날은 31일입니다.");
//        } else if (month == 2) {
//            System.out.println("2월의 마지막 날은 28일 입니다.");
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            System.out.println(month + "월의 마지막 날은 30일 입니다.");



        }
    }
}
