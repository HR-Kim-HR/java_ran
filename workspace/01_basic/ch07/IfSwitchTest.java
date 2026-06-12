package ch07;


// 나이에 따른 입장료 할인을 계산하는 프로그램을 작성하세요.
// 7세 이하: 영유아 100% 할인
// 8 ~ 13: 어린이 50% 할인
// 14 ~ 19: 청소년 30% 할인
// 65세 이상: 70% 할인
public class IfSwitchTest {
    public static void main(String[] args) {
        int age = 15;

        int price = 20000;
        double discountRate = 0.0; // 할인율 (30% 할인의 경우 0.3)
        int lastPrice = price;

        // 요금을 계산하세요. 케이스가 너무 많아서 if 문이 적합하다. case 문으로 하기에는 너무 케이스가 64개라서 너무 많다.


        // 복습
        if(age<=7) {
            discountRate = 1.0;
        } else if (age<=13) {
            discountRate = 0.5;
        } else if (age<=19) {
            discountRate = 0.3;
        } else if (age >= 65) {
            discountRate = 0.7;
        } else {
            discountRate = 0;
        }

        lastPrice = (int) (price * ( 1- discountRate)) ;
        System.out.println( "나이가 " + age + "세 이므로 할인율 " + discountRate * 100 + "%가 적용되어 요금은 " + lastPrice + "원입니다." );



//        if(age<=7) {
//            discountRate = 1;
//        } else if (age<=13) {
//            discountRate = 0.5;
//        } else if (age<=19) {
//            discountRate = 0.3;
//        } else if (age>=65) {
//            discountRate = 0.7;
//        }
//
//        lastPrice = (int) (price * (1 - discountRate / 100.0)) ;       // 내가 시도했으나 할인율 적용이 살짝 이상함.  나이가 15세 이므로 할인율 30.0%가 적용되어 요금은 19940원 입니다. 라고 나옴.

        if(age <= 7) {
            discountRate = 1.0;   // 1이라고 써도 더블 적용되어 상관없긴 함
        } else if (age <= 13) {   // (age >= 8 && age <= 13)
            discountRate = 0.5;
        } else if (age <= 19) {
            discountRate = 0.3;
        } else if (age >= 65) {
            discountRate = 0.7;
        } else {
            discountRate = 0;
        }

        lastPrice = (int) (price * (1 - discountRate)); // 원래 price 는 그대로 있고 계산을 위해서만 int 를 임시로 격에 맞추어 쓴다.

        System.out.println("나이가 " + age + "세 이므로 할인율 " + discountRate * 100 + "%가 적용되어 요금은 " + lastPrice + "원 입니다.");



        // switch 함수 연습
        switch (age) {
            case 1,2,3,4,5,6,7:
                discountRate = 1.0;
                break;
            case 8, 9, 10, 11, 12, 13:
                discountRate = 0.5;
                break;
            case 14, 15, 16, 17, 18, 19:
                discountRate = 0.3;
                break;
            case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
                 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65:
                discountRate = 0.0;
                break;
            default:
                discountRate = 0.7;


        }


    }
}



