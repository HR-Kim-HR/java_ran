package ch12.animal;

public class Test {
    public static void main(String[] args) {
        Dog haru = new Dog();
//        Animal haru = new Dog(); // 자식 인스턴스를 부모의 타입으로 선언 가능, new 앞에 (Animal) 생략된 형태
        haru.eat(); // 부모에게 물려 받은 메서드
        haru.bark(); // 추가한 메서드

        animalCare(haru); // haru 앞에 (Animal) 생략된 형태

        // is-a 관계가 성립되지 않는 잘못된 상속
//        Notebook book = new Notebook();
//        animalCare(book);

        Cat c = new Cat();
        animalCare(c);                     // c에 넣는 값의 변수 타입에 따라 스스로 알아서 강아지에 맞게 적용, 고양이에 맞게 적용하는 것이 오버로딩
    }

    // 동물 관리 서비스
    static void animalCare(Animal a) { // 다형성 : 과거의 코드가 미래의 코드를 호출! -> 앞으로 계속 나올 예정
        // Animal.eat()를 호출하는 동일한 코드지만 실제 생성된 객체의 오버라이딩 된 메서드가 호출됨
        // 3년 뒤 신입사원 보거라!!! 오늘은 2023년 5월 22일이다.
        // 너가 2026.06.05 에 Cat의 eat() 메서드 만들 예정이라는 걸 이미 알고 있다.
        // 나의 a.eat() 는 너의 Cat.eat() 를 호출하게 될 것이다.
        a.eat();
        a.move();
        a.sleep();
//        a.bark();
//        a.liquefy();
    }

    // 강아지 관리 서비스
    static void animalCare(Dog a) {
        a.eat();
        a.move();
        a.sleep();
//        a.bark(); / Animal 에는 정의되어 있지 않음
    }

    // 고양이 관리 서비스
    static void animalCare(Cat a) {
        a.eat();
        a.move();
        a.liquefy();
        a.sleep();
//        a.bark(); / Animal 에는 정의되어 있지 않음
    }
}
