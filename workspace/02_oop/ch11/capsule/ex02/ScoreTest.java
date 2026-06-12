package ch11.capsule.ex02;

public class ScoreTest {
    public static void main(String[] args){
        Score haru = new Score(100,90,85);
        // 필드의 직접 접근은 제한됨
        //        haru.kor = 123456789;

//        int haruSum = haru.sum();
//        System.out.println("하루의 총점: " + haruSum);

        double haruAvg = haru.avg();
        System.out.println("하루의 평균: " + haruAvg);

        //        ver 1.
//        int harubeforeMathScore = haru.getMath();
//        int haruAfterMathScore = harubeforeMathScore + 5;
//        haru.setMath(haruAfterMathScore + 5);

        // ver 2.
//        haru.setMath(haru.getMath() + 5);

        haru.setMath(haru.getMath() * 5);

        haruAvg = haru.avg();
        System.out.println("하루의 수정된 평균: " + haruAvg);


    }
}
