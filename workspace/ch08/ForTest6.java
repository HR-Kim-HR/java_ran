package ch08;

// 1~9 구구단
// 2 x 1 = 2   3 x 1 = 3     4 x 1 = 4    ... 9 x 1 = 9
// 2 x 2 = 4   3 x 2 = 6     4 x 2 = 8    ... 9 x 2 = 18
// ...         ...           ...          ... ...
// 2 x 9 = 18  3 x 9 = 27    4 x 9 = 36   ... 9 x 9 = 81

public class ForTest6 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++) { // 9행
            for(int k=2; k<=9; k++){ // 8열
                System.out.print(k + "x" + i + "=" + (k*i) + "\t");  // k = 2, 3, 4, ... , 9
            }
            System.out.println();
        }
    }
}

//   \t 는 제어문자 , \t 는 탭기능을 해라! 탭키(스페이스 4칸)는 어디서 끝났든지간에 다음에 시작하는 들여쓰기 정렬에 맞추어서 시작.
//   \l 은 제어문자, \l 은 줄바꿈을 해라!