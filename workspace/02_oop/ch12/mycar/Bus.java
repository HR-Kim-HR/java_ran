package ch12.mycar;

public class Bus extends Car {

    private int passengerCount; // 승객 수
    private String no; // 버스 번호
    private String type; // 버스 종류 예) 광역 버스, 마을 버스, 시내 버스, 시외 버스, 고속 버스
    private String[] stations; // 버스 노선
    private int station; // 현재 위치
    private int price; // 버스요금
    private int maxPassenger; // 최대 승객수
    private int money; // 현재까지의 수익
    private int totalPassenger; // 총 승차 인원
    private int totalMoney; // 운영하는 모든 버스의 수익

    int DC; // 할인율
    int lastprice; // 할인율 적용된 최종요금


    // 컴파일러에 의해서 자동으로 생성되는 기본 생성자 모습
//    Bus(){super();}

    public Bus(String model, String no, String type, String[] stations, int price, int maxPassenger) {
        super(model);
        this.no = no;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.maxPassenger = maxPassenger;
    }

    // 승차합니다.
    void ride(String passengerType){
        // 수익 증가
        // 어린이 30% / 청소년 20% / 성인 / 노인별 50% 할인율 적용해서 할인
        // 교통카드 / 현금 / 기타 할인 (지역 주민 할인, 특정 카드 이용시 할인)
        if(passengerCount < maxPassenger){
            passengerCount++;
            System.out.println("1명이 승차합니다.");
        } else {
            System.out.println("승차 인원이 초과되었습니다. 다음 버스를 이용해주세요.");
        }

        switch (passengerType){
            case "어린이":
                DC = 30;
                break;
            case "청소년":
                DC = 20;
                break;
            case "성인":
                DC = 0;
                break;
            case "노인":
                DC = 50;
                break;
        }

        lastprice = (int) (price * (1-DC/100.0));
        System.out.println(passengerType + ": " + lastprice + "원");

    }


    // 하차합니다.
    void leave(){
        passengerCount--;
        System.out.println("1명이 하차합니다.");
    }

    // 오버라이딩: 부모 메서드를 자식이 재정의
    void stop(){
        super.stop();
        station++;

        // station 이 끝에 도달하면 다시 0으로 초기화
        if(station == stations.length){
            station = 0;
        }
        System.out.println("이번 역은 " + stations[station] + "역 입니다. This stop is " + stations[station]);
    }

    // 기다리는 버스가 몇 정거장 전에 있는가?
    int getStationsleft(){
        int result = 0;

        return result;
    }

    // 버스의 현재 상태를 출력합니다.
    String getBusInfo(){
        return "버스 번호: " + no
            + ", 종류: " +  type
            + ", 현재 위치:" + stations[station]
            + ", 남은 좌석: " + (maxPassenger-passengerCount)
            + ", 요금: " + price;
    }
}
