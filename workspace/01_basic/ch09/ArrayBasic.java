package ch09;

public class ArrayBasic {

//    int age = 25; 이처럼 메소드 바깥쪽에도 변수 선언 가능

    public static void main(String[] args){
        // scores int 배열을 선언하고 생성하세요. (크기는 3)
        int[] scores;
        scores = new int[3];

        // names String 배열을 선언하고 생성하세요. (크기는 3)
        String[] names = new String[5];

        // scores 배열의 각 요소에 값을 할당
        scores[0] = 70;
        scores[1] = 80;
        scores[2] = 90;

        // names 배열의 각 요소에 값을 할당
        names[0] = "바흐";
        names[1] = "베토벤";
        names[2] = "모차르트";
        names[3] = "헨델";
        names[4] = "슈바이처";

        // scores 배열의 두번째 요소값을 출력
        System.out.println(scores[1]);

        // names 배열의 모든 요소값을 출력
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);

        for(int i=0; i<names.length; i++) {
            System.out.println(names[i]); // 조건문에 i<5 적용시, i=0 일 때 names[0]=바흐, i=1 일 때 names[1]=베토벤, ...
        }
    }
}

// for 문은 대부분 배열과 같이 사용한다.
// for(int i=0; i<names.length; i++) { }
// i 라고 쓰는 이유는 index 의 약자 i       index 는 몇 번째에 해당하는 것 (CSH님)
// length 는 할당된 값의 크기를 의미하며, 배열 사용할 때, length 는 거의 따라오는 세트로 볼 수 있음 (LSE님)