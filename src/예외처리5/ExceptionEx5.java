package 예외처리5;
//finally : 어떤 예외가 발생하더라도 반드시 실행되어야 하는 부분을 나타내줌.

import java.util.Scanner;

public class ExceptionEx5 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;                               // continue를 썼음에도 아래의 finally 때문에 while문의 처음으로 돌아가지 않는다.
            } finally {
                System.out.println("결과 : " + rst);
                break;
            }
        }
    }
}
