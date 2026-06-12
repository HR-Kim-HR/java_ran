package ch14;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        // 주소를 비교하고 싶으면 == 사용
        System.out.println(s1 == s2);
        System.out.println(s1 == "Hello");
        System.out.println(s2 == "Hello");

        // 값을 비교하고 싶으면 equals 사용
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hello"));
        System.out.println(s2.equals("Hello"));

        // 문자를 다룰 때 결합연산자 사용하는 것은 비효율적 -> 문자열 클래스 String, StringBuffer, StringBuilder 활용
        s1 += " World";
        s1 += " Java";
        s1 += " Program" ;

        System.out.println(s1);

    }
}
