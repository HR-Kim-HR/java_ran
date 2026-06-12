package ch13.family.ex01;

public class Test {

    public static void main(String[] args){
//        Parent p = new Parent("부모");
        Parent p = (Parent) new Son("아들"); // up casting (자동 형변환, 자식 -> 부모)       Son p = new Son("아들")
//        Daughter p = new Daughter("딸");

        dailySchedule(p);
    }

    // 하루 일과
    private static void dailySchedule(Parent p){ // Parent 타입의 매개 변수 정의

        p.eat();
        p.play();

        if(p instanceof Son) { // p가 Son 인스턴스인지 여부를 체크
            Son s = (Son) p; // down casting (명시적 형변환, 부모 -> 자식)
            s.study();
        }

        p.sleep();
    }

    // 하루 일과
    private static void dailySchedule(Son p){
        p.eat();
        p.play();
        p.sleep();
    }

    // 하루 일과
    private static void dailySchedule(Daughter p){
        p.eat();
        p.play();
        p.sleep();
    }

}
