package ch10;

public class MethodOverloading {
    void main(){
        int[] scores = {89, 78, 79};
        System.out.println(tostring(scores));

        double[] scores2 = {12.0, 45.6};
        System.out.println(toString(scores2));

        String[] names = {"haru", "namu", "brong"};
        System.out.println(toString(names));
    }

    // int 배열 내부의 모든 요소 값들을 문자열로 반환한다.
    // [45, 8, 14, 29, 33]
    String tostring(int[] arr){
        String result = "[";
        for(int i=0; i<arr.length; i++) {      // i: 0 , result: [89,    i: 1, result: [89, 78,    i: 2, result: [89, 78, 79]
            result += arr[i];
            if(i != arr.length-1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    // double 배열 내부의 모든 요소 값들을 문자열로 반환한다.
    String toString(double[] arr){
        String result = "[";
        for(int i=0; i<arr.length; i++) {      // i: 0 , result: [89,    i: 1, result: [89, 78,    i: 2, result: [89, 78, 79]
            result += arr[i];
            if(i != arr.length-1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    String toString(String[] arr){
        String result = "[";
        for(int i=0; i<arr.length; i++) {      // i: 0 , result: [89,    i: 1, result: [89, 78,    i: 2, result: [89, 78, 79]
            result += arr[i];
            if(i != arr.length-1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

}


