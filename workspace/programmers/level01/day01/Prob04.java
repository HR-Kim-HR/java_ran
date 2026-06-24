package level01.day01;

import java.util.Scanner;

public class Prob04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);

            if(Character.isUpperCase(b)){
                result = result + Character.toLowerCase(b);
            }
            else if (Character.isLowerCase(b)){
                result = result + Character.toUpperCase(b);
            }
        }
        System.out.println(result);
    }
}



//    일부 참고용
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//
//            // 대문자이면 소문자로 변환
//            if (Character.isUpperCase(c)) {
//                sb.append(Character.toLowerCase(c));
//            }
//            // 소문자이면 대문자로 변환
//            else if (Character.isLowerCase(c)) {
//                sb.append(Character.toUpperCase(c));
//            }
//        }
//
//        System.out.println(sb.toString());
//    }

