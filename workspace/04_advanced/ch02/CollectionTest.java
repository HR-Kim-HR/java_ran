package ch02;

import java.util.*;

public class CollectionTest {
    void main(){
//        String[] fruits = new String[5];
//        fruits[0] = "바나나";
//        fruits[1] = "사과";
//        fruits[2] = "오렌지";
//        fruits[3] = "파인애플";
//        fruits[4] = "수박";
//
          List<String> fruits = new ArrayList<>(); // List 는 중복 가능, 순서 정보 유지
//        List<String> fruits = new LinkedList<>();
//        List<String> fruits = new Vector<>();
//
//
//        HashSet<String> fruits = new HashSet<>(); // Set 은 데이터 중복 없음, 순서 정보 유지 하지 않음
//        TreeSet<String> fruits = new TreeSet<>(); // Set 기능 두 가지 그대로 가지며, 정렬 기능 (ㄱㄴㄷ순)
//        LinkedHashSet<String> fruits = new LinkedHashSet<>(); // 저장한 순서 유지

        fruits.add("바나나");
        fruits.add("사과");
        fruits.add("오렌지");
        fruits.add("파인애플");
        fruits.add("수박");
        fruits.add("사과");

        printFruit(fruits); // 배열
    }

    // 전달받은 과일목록을 출력한다.
    void printFruit(String[] fruits){
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
    }

//    void printFruit(String[] fruits) {
//        for (int i = 0; i<fruits.length; i++)
//            System.out.println(fruits[i]);
//    }

//
//    void printFruit(Collection<String> fruits){
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//    }
//
    void printFruit(List<String> fruits){
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    void printFruit(Set<String> fruits){
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
//
//    void printFruit(ArrayList<String> fruits){
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//    }
//
//    void printFruit(LinkedList<String> fruits){
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//    }
//
//    void printFruit(Vector<String> fruits){
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//    }
//
//    void printFruit(HashSet<String> fruits){
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//    }
//
//    void printFruit(TreeSet<String> fruits){
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//    }

}

