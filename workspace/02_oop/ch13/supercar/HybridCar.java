package ch13.supercar;

public class HybridCar extends SuperCar {
//    컴파일러에 의해 기본 생성자 만들어짐
//    HybridCar() { super(); }

    HybridCar(int zero100){
        super(zero100);
    }

    @Override
    void move() {
        // 9.
        super.move();
        // 11.
        System.out.println("기름과 전기를 사용합니다.");
    }
}
