package ch08;

// 첫 달에 1원을 받고 매달 두 배씩 받을 때
// 몇 달이 지나야 급여가 1억을 넘기는가?

public class WhileTest2 {
    public static void main(String[] args) {
        int month = 1; // 근무달(몇 달차인지)
        int sal = 1; // 월급

        while(sal < 100000000){
            month++;
            sal *= 2;  // sal = sal * 2; 와 같음

        }

        System.out.println(month + "달의 급여: " + sal);
    }

}
