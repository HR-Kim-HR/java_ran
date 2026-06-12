package ch13.supercar;

public class PluginHybridCar extends SuperCar implements Chargeable { // implements Chargeable 붙일 때, 10번째줄 void charge() 앞에 public 붙여야 함

    PluginHybridCar(int zero100){
        super(zero100);
    }

    @Override
    void move() {
        super.move();
        System.out.println("전기를 사용합니다.");
    }

    public void charge(){
        System.out.println("전기를 충전합니다.");
    }
}
