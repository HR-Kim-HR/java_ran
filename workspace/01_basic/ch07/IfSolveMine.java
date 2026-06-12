package ch07;

// [문제] 시험 점수(score)에 따른 학점을 출력하는 코드를 작성하세요.
// 학점 기준:
// - 90점 이상 ~ 100점 이하: A
// - 80점 이상 ~ 89점 이하: B
// - 70점 이상 ~ 79점 이하: C
// - 60점 이상 ~ 69점 이하: D
// - 0점 이상 ~ 59점 이하: F
// - 그 외의 점수 (음수이거나 100점을 초과하는 경우): "올바르지 않은 점수입니다."" 출력
public class IfSolveMine {
    public static void main(String[] args) {
        int score = 55;

        // 만약 score 가 90점 이상, 그리고 100점 이하라면...
        // 그렇지 않을 경우 (음수이거나 100점을 초과하는 경우)


        // 두번째 시도 - else 에 해당하는 그 외의 점수 범위 설정이 제대로 되지 않아서 그 부분만 오류..
//        if (score >= 90 && score =< 100) {
//            System.out.println("A");
//        } else if (score >= 80) { // 80 이상이라고만 하면 100 초과하는 경우를 담을 수 없으므로 100 이상인 경우 B로 출력
//            System.out.println("B");
//        } else if (score >= 70) { // 위와 마찬가지로 다 추가해야 함
//            System.out.println("C");
//        } else if (score >= 60) {
//            System.out.println("D");
//        } else if (score >= 0 && score <= 59) {     // && score <= 59 는 생략 가능
//            System.out.println("F");
//        } else {
//            System.out.println("올바르지 않은 점수입니다.");
//        }



        // 내가 시도한 것   -> && 연산자 활용을 간과함, 앞의 범위에서 이미 해결되었으면 간단하게 범위 설정 필요. 90 =< score =< 100 는 틀림. score >= 90 && score =< 100 로 써야함.
//        if (90 =< score =< 100) {
//            System.out.println("A");
//        } else if (80 =< score =< 89) {
//            System.out.println("B");
//        } else if (70 =< score =< 79) {
//            System.out.println("C");
//        } else if (60 =< score =< 69) {
//            System.out.println("D");
//        } else if (0 =< score =< 59) {
//            System.out.println("F");
//        } else (0 < score || score > 100) {
//            System.out.println("올바르지 않은 점수입니다.");
//        }

    }
}