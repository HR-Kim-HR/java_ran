package ch13.supercar;

public class Driver {

    // 기본 생성자
//    Driver(){}

    void drive(SuperCar car){
        // 2. 8.
        car.move(); // car 를 gcar 로 받으면 GasolineCar 클래스로 이동, 매개변수 타입에 따라 ..

        // 6. 12.
        if(car instanceof Chargeable) {  // 부모에서 자식으로 다운캐스팅
            ((Chargeable)car).charge(); // Chargeable 타입으로 변환
        }
    }
}
