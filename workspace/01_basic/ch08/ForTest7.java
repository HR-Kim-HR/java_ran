package ch08;

public class ForTest7 {
    public static void main(String [] args) {
        // continue 를 이용한 홀수 합계
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i % 2 == 0){ // 짝수일 때
                continue;   // 증감식으로 이동
            }
            sum += i;
        }
        System.out.println("1~100 홀수 합계: " + sum);

        // i = 1, sum = 1
        // i = 2, sum = 1
        // i = 3, sum = 4
        // i = 4, sum = 4
        // i = 5, sum = 9
        //


        // 1~100 합계
        int num = 1;
        sum = 0;
        while(true){
            sum += num; // sum = 0, 1, 3, 6, 10, 15, ...
            num++; // 1, 2, 3, 4 ...
            if(num > 100) {
                break;
            }
        }
        System.out.println("1~100 합계: " + sum);
    }
}

// 굳이 continue 를 사용하는 건 권장되지 않음
// while(true) 로 설정하면 무한루프라서 실행되지 않고 오류발생할 수 있으니 if(num>100) { break; } 을 넣어주어야 함



//        int num = 1;
//            sum = 0;
//        while(num <= 100){
//            sum += num; // sum = 0, 1, 3, 6, 10, 15, ...
//            num++; // 1, 2, 3, 4 ...
//
//            }
//        }
//        System.out.println("1~100 합계: " + sum);
