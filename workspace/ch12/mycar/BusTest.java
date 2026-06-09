package ch12.mycar;

public class BusTest {
    void main (){
        Bus mycar = new Bus("람보르기니", "10-2", "마을버스", new String[]{"우리집","김포고등학교","김포시청"},1300,15);

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();

        mycar.ride("청소년");
        mycar.ride("어린이");
        mycar.ride("노인");

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedDown();
        mycar.stop();

        mycar.ride("성인");
        mycar.ride("청소년");
        mycar.leave();
        mycar.leave();
        mycar.ride("성인");
        mycar.ride("어린이");
        mycar.ride("성인");

        mycar.start();
        mycar.ride("청소년");
        mycar.ride("청소년");
        mycar.ride("청소년");
        mycar.ride("어린이");
        mycar.ride("어린이");
        mycar.ride("성인");
        mycar.ride("노인");
        mycar.ride("성인");
        mycar.ride("노인");
        mycar.ride("어린이");
        mycar.ride("성인");
        mycar.ride("성인");


        System.out.println(mycar.getBusInfo());
    }
}

// 메서드와 데이터 둘 다 관리해! -> 객체 개념     심부름시킬 때, 아예 돈을 맡겨버리는 것