package ch12.car;

public class CarTest {
    void main (){
        Car mycar = new Car ("람보르기니");
        mycar.speed = 100;

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();

        mycar.stop();
    }
}

// 메서드와 데이터 둘 다 관리해! -> 객체 개념     심부름시킬 때, 아예 돈을 맡겨버리는 것