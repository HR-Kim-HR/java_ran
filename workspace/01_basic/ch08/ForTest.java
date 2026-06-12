package ch08;

public class ForTest {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]); // 10 이라고 생각하자. 우측메뉴 edit - program arguments 에 10 넣은 상태.
        int sum = 0;

        for (int i = 1; i <= num; i++) { // i 1, 2, 3, ... num  // num 번 반복한다
            sum += i;
            System.out.println("i: " + i + ", sum: " + sum);
        }
        System.out.println("1부터 " + num + "까지의 합계: " + sum);
    }
}

// 1번) int i = 1;
// 2번) i <= num;
// 3번) i++
// 4번) sum += i;
//      System.out.println("i: " + i + ", sum: " + sum);
// 작동 순서 1 > 2 > 4 > 3 >>> 2 > 4 > 3 >>> 2 > 4 > 3 >>> 반복하다가 i=10 인 경우까지 작동한 후 완료

// for 함수는 횟수가 정해져 있음. 반복횟수 알아야 사용가능. 여기서는 10회로 정해짐.
// for (초기화; 조건식; 증감식) {}

// args[0] 처럼 [] 안에 숫자가 있는데 10으로 설정하려면 우측 상단 Run 연두색 화살표 왼쪽의 V 표 클릭 - 해당 클래스명 - 점 세 개 - edit - Program arguments 항목에 10 입력
// 위처럼 10을 설정하지 않으면 아래와 같이 오류 메시지 등장

//"C:\Program Files\Eclipse Adoptium\jdk-25.0.3.9-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.1.2\lib\idea_rt.jar=55298" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\bebc25\java_ran\out\production\java_ran ch08.ForTest
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//at ch08.ForTest.main(ForTest.java:6)
//
//Process finished with exit code 1

// 1~10까지의 합계를 구한 것이다!