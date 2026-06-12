package ch13.supercar;

public class DriveTest {
    public static void main(String[] args) {
        GasolineCar gcar = new GasolineCar(5); // new 는 새로운 걸 생성 후 주소 반환
        HybridCar hcar = new HybridCar(7);
        ElectricCar ecar = new ElectricCar(8);
        PluginHybridCar pcar = new PluginHybridCar(3);

        Driver driver = new Driver();
        // 1.
        driver.drive(gcar);
        // 7.
        driver.drive(hcar);
        driver.drive(ecar);
        driver.drive(pcar);

        //
        System.out.println("프로그램 종료");
    }
}
