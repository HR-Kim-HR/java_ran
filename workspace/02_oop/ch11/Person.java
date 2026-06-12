package ch11; // 객체: 내가 쓸 데이터는 내가 저장한다. 바로바로 읽고 쓰는 작업 가능

public class Person {
    String name;
    int age;

    void introduce(){
        System.out.println("내 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
    }
}
