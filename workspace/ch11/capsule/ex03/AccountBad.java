package ch11.capsule.ex03;
// public 이므로 자유롭게 그대로 사용 가능
public class AccountBad {
    // 잔고
    public int balance;

    // 입금(amount 만큼 balance 증가)
    public void deposit(int amount){
        if(amount >0){
            this.balance += amount; // this. 는 없어도 괜찮음 // this. 빼고 만든 게 나의 방법이었음
            System.out.println(amount + "원이 입금 되었습니다. 잔고는 " + balance + "원 입니다.");
        } else {
            System.out.println("입금액이 잘못 되었습니다.");
        }
    }

    // 출금 (amount 만큼 balance 감소, 잔고가 부족한지 체크 필요)
    public void withdraw(int amount){

        if(balance >= amount) {
            this.balance -= amount; // this. 는 없어도 괜찮음
            System.out.println(amount + "원이 출금 되었습니다. 잔고는 " + balance + "원 입니다.");
        } else {
            System.out.println("잔고가 부족합니다. 잔고는 " + balance + "원 입니다.");
        }

        // 나의 방법 -> 맞음
//        if (balance >= amount){
//            balance -= amount;
//            System.out.println(amount + "원이 출금 되었습니다. 잔고는 " + balance + "원 입니다.");
//        } else {
//            System.out.println("잔고가 부족합니다. 잔고는 " + balance + "원 입니다.");
//        }

    }

}
