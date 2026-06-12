package ch12.car;

import java.util.Arrays;
import java.util.Objects;

public class Bus extends Car{

    private int passengerCount; // 승객 수
    private String no; // 버스 번호
    private String type; // 버스 종류 예) 광역 버스, 마을 버스, 시내 버스, 시외 버스, 고속 버스
    private String[] stations; // 버스 노선
    private int station; // 현재 위치
    private int price; // 버스요금
    private int maxPassenger; // 최대 승객수
    private int money; // 현재까지의 수익
    private int totalPassenger; // 누적 승차 인원
    // 인스턴스 레벨이 아니라 클래스 레벨에서 관리하는 공용 변수 선언
    private static int totalMoney; // 운영하는 모든 버스의 수익

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
    void ride(){
        // 수익 증가
        // 어린이 / 청소년 / 성인 / 노인별 할인율 적용해서 할인
        // 교통카드 / 현금 / 기타 할인 (지역 주민 할인, 특정 카드 이용시 할인)
        if(passengerCount < maxPassenger){
            passengerCount++; // 현재 승차인원
            money += price; // 버스 1대의 수익
            totalPassenger++; // 누적 승차인원
            totalMoney += price; // 모든 버스의 전체 수익
            System.out.println("1명이 승차합니다.");
        } else {
            System.out.println("승차 인원이 초과되었습니다. 다음 버스를 이용해주세요.");
        }
    }

    // count 만큼 승차 처리
    // 메서드 오버로딩
    void ride(int count){
        for(int i=0; i<count; i++) {
            ride();
        }
    }

    // 하차합니다.
    void leave(){
        passengerCount--;
        System.out.println("1명이 하차합니다.");
    }

    // count 만큼 하차 처리
    // 메서드 오버로딩
    void leave(int count){
        for(int i=0; i<count; i++) {
            ride();
        }
    }

    // 오버라이딩: 부모 메서드를 자식이 재정의
    @Override
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

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCount=" + passengerCount +
                ", no='" + no + '\'' +
                ", type='" + type + '\'' +
                ", stations=" + Arrays.toString(stations) +
                ", station=" + station +
                ", price=" + price +
                ", maxPassenger=" + maxPassenger +
                ", money=" + money +
                ", totalPassenger=" + totalPassenger +
                ", totalMoney=" + totalMoney +
                '}';
    }

    @Override
    public boolean equals(Object o) { // Bus -> Object 자동 형변환
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o; // 원래 객체로 복원하려면 명시적 형변환 필요
        return Objects.equals(no, bus.no);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(no);
    }
}
