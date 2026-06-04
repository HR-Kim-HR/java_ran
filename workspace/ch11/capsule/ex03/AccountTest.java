package ch11.capsule.ex03;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account();

        // 10000원이 입금 되었습니다. 잔고는 10000원 입니다.
        myAccount.deposit(8000);
        // 5000원이 출금 되었습니다. 잔고는 5000원 입니다.
        myAccount.withdraw(5000);

//        myAccount.balance = -10000; // 캡슐화로 해결, 캡슐화를 통해 외부에서 변수를 임의로 변경하지 못 하게 하기 위해, 보호하려는 목적
        // 잔고가 부족합니다. 잔고는 5000원 입니다.
        myAccount.withdraw(10000);

        System.out.println("현재 잔고: " + myAccount.getBalance() + "원");
    }
}
