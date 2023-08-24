package 정적멤버와메소드;

public class StaticMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 0);
        kakao.setDeposit(2300);                 // 카뱅에 2300원 입금
        kakao.setWithdraw(1850);                // 카뱅에서 1850원 출금
        kakao.viewAccount();
        shinhan.setWithdraw(2000);              // 신한에서 2000원 출금
        shinhan.viewAccount();
        System.out.println(Bank.getCount());    // 클래스에 대한 메소드 접근
    }
}
