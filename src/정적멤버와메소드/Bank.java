package 정적멤버와메소드;

public class Bank {
    private static int count = 0;       // 정적 필드의 멤버 count. 객체로 생성되지 않는다. compile될 때 즉, class 열 때 메소드 영역에 한 번 생성되고 끝. count는 계좌 개설 횟수.
    private String bank;                // 은행 이름. 객체로 만들어질 때 Heap 영역에 동적 할당됨.
    private int account;                // 계좌에 들어있는 돈.
    Bank(String name, int account) {
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(bank + "은행에 계좌를 개설합니다.");
        System.out.println("잔액은 " + this.account + "원 입니다.");
    }
    public static int getCount() {                  // 정적 메소드 : 객체로 만들어지지 않음.
        return count;
    }
    public void setDeposit(final int dep) {         // dep : 예금하려는 금액. 들어오려는 금액이 바뀌면 안되므로 final로 상수 선언.
        this.account += dep;
        System.out.println(dep + "원을 예금하였습니다.");
    }
    public void setWithdraw(final int wit) {
        if(wit > account) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= wit;
        }
    }
    public void viewAccount() {
        System.out.println(bank + "은행의 현재 잔액은 " + account + "원 입니다.");
    }
}
