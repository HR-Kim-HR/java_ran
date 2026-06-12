package ch09;

public class ArrayException {
    public static void main (String[] args) {
        // 1. NullPointerException
        String[] strArr = {"haru", "namu", "brong"};
        System.out.println(strArr[0]);

        int[] ageArr = null;
//        int[] ageArr = new int[3];

        if(ageArr != null) {                 // null 값인지 아닌지 체크
            System.out.println(ageArr[0]);
        }

        // 2. ArrayIndexOutOfBoundsException
        if(strArr.length > 3){               // 배열의 갯수가 3보다 큰 경우 무엇을 출력하는지 조건 설정
            System.out.println(strArr[3]);
        }

        System.out.println("main 실행 완료");
    }
}
