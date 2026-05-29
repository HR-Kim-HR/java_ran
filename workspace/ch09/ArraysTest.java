package ch09;

import java.util.Arrays;

public class ArraysTest {
    public static void main (String[] args) {
        int[] arr = {2, 5, 8, 1, 3, 17, 33, 19, 77, 52};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, 3};
        int[] arr4 = {1, 2, 3};


        // 1. arr의 모든 요소를 출력하세요.
        // 2, 5, 8, 1, 3, 17, 33, 19, 77, 52

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr)); //  배열을 문자열로 변환하는 메서드          [ , , ] 형태 출력, 디버깅할 때, 확인하고 싶을 때 검증용

//        나의 시도 (정답)
//        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        // 2. arr2와 arr3, arr2와 arr4 의 모든 요소가 같은 값을 가지고 있는지 출력하세요. (순서와 값이 모두 일치)
        // arr2, arr3 다름
        // arr2, arr4 같음

//        System.out.println(arr2 == arr3); // 주소가 같냐고 물은 것이기에 false 나옴
//        System.out.println(arr2 == arr4); // 주소가 같냐고 물은 것이기에 false 나옴


//        boolean isEqual = true; // 두 배열의 모든 요소가 같으면 true, 아니면 false
//        for(int i=0; i<arr2.length; i++) {
//            if(arr2[i] != arr3[i]) {
//                isEqual = false;
//                break;
//            }
//        }
//        System.out.println("arr2, arr3 " + (isEqual ? "같음":"다름"));
//
//        boolean isEqual = true; // 두 배열의 모든 요소가 같으면 true, 아니면 false
//        for(int i=0; i<arr2.length; i++) {
//            if(arr2[i] != arr4[i]) {
//                isEqual = false;
//                break;
//            }
//        }
//        System.out.println("arr2, arr4 " + (isEqual ? "같음":"다름"));


        boolean isEqual = true; // 두 배열의 모든 요소가 같으면 true, 아니면 false
        for(int i=0; i<arr2.length; i++) {
            if(arr2[i] != arr3[i]) {
                isEqual = false;
            }
        }
        System.out.println("arr2, arr3 같다. -> " + isEqual);


        System.out.println("arr2, arr3 " + Arrays.equals(arr2, arr3));
        System.out.println("arr2, arr4 " + Arrays.equals(arr2, arr4));

//        나의 시도 - 왜 둘다 '같음' 으로 나오는가... 아 데이터 범위를 비교한듯..
//        if (arr2.length == arr3.length) {
//            System.out.println("arr2, arr3 같음");
//        } else {
//            System.out.println("arr2, arr3 다름");
//        }
//
//        if (arr2.length == arr4.length) {
//            System.out.println("arr2, arr4 같음");
//        } else {
//            System.out.println("arr2, arr4 다름");
//        }


        // 3. arr 요소의 최소값과 최대값을 구하세요.
        // 최소값: 1
        // 최대값: 77

//        int min = arr[0] ; // 최소값
//        int max = arr[0] ; // 최대값
//
//        for(int i=1; i<arr.length; i++) {
//            if(arr[i] < min) { // 비교할 값이 최소값보다 작을 경우
//                min = arr[i]; // 최소값을 교체한다.
//
//            }
//            if(arr[i] > max) { // 비교할 값이 최대값보다 클 경우
//                max = arr[i] ; // 최대값을 교체한다.
//            }
//
//        }
//
//        System.out.println("최소값: " + min);
//        System.out.println("최대값: " + max);


        Arrays.sort(arr);                                          // 오름차순 정렬하는 메소드
        System.out.println("최소값: " + arr[0]);
        System.out.println("최대값: " + arr[arr.length-1]);


        // 4. arr의 요소를 오름차순으로 정렬하세요.
        // 1, 2, 3, 5, 8, 17, 19, 33, 52, 77

//        for(int i=0; i<arr.length; i++) {
//            for(int k=i; k<arr.length-1; k++) {
//                if(arr[i] > arr[k+1]) {
//                    // arr[i] <-> arr[k+1]
//                    int temp = arr[i];
//                    arr[i] = arr[k+1];
//                    arr[k+1] = temp;
//
//                }
//            }
//        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);                           // 정렬 - 오름차순만 가능한건가..? 그렇다. 내림차순은 reverse 를 쓰든가 옵션 설정 필요.
        System.out.println(Arrays.toString(arr));
    }
}
