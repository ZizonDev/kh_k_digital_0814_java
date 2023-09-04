package 예외처리4;
// ArithmeticException : 0으로 나누면 발생하는 런타임 에러.

import java.util.Scanner;

public class ExceptionEx4 {
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
                continue;
            }
            System.out.println("결과 : " + rst);
            break;
        }
    }
}
