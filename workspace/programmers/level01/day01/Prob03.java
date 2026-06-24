package level01.day01;

import java.util.Scanner;

public class Prob03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(str);
        }
    }

//        다른 사람들의 풀이 중 많이 사용한 방법
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int n = sc.nextInt();
//
//        System.out.println(str.repeat(n));
//    }

}

// string 5 입력
// stringstringstringstringstring 출력

