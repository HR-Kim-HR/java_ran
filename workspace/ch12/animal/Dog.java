package ch12.animal;

public class Dog extends Animal{ // Dog is an Animal 이 성립해야 상속 가능
    void eat(){
        System.out.println("강아지가 먹는다.");
    }

    void bark(){
        System.out.println("멍멍 짖는다.");
    }
}

// 부모: 동물(일반화)   자식: 강아지,고양이(특별화)     자식 is a 부모 가능 여부 확인 필요!
