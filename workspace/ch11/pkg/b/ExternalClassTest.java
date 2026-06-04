package ch11.pkg.b;

import ch11.mycar.ex01.Car;              // 다른 폴더에 있다면 import 삽입 필요, 같은 폴더라면 불필요
import ch11.pkg.a.SomeClass;

public class ExternalClassTest {
    public static void main(){
        SomeClass s = new SomeClass();
        Car c = new Car();
    }
}
