package ch08;

public class ForSolve {
    public static void main(String [] args) {

        int sum = 0;

        // 1~100 합계

        for (int i = 1; i <= 100; i++) { // i: 1, 2, 3, 4 ...
            sum += i;

        }
        System.out.println("1~100까지의 합계: " + sum);

        // 1~100 홀수 합계
        sum = 0;
        for (int i = 1; i <= 100; i+=2) { // i: 1, 3, 5, 7 ...
            sum += i;

        }
        System.out.println("1~100까지의 홀수합계: " + sum);

        sum = 0;
        for(int i=1; i<=100; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("1~100 홀수 합계: " + sum);

        // 1~100 짝수 합계
        sum = 0;
        for (int i = 2; i <= 100; i+=2) { // i: 2, 4, 6, 8 ...
            sum += i;

        }
        System.out.println("1~100까지의 짝수합계: " + sum);

    }
}
