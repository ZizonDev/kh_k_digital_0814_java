package 연습문제_0816;
/*
### 연습문제(2)

100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기
 */

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num - a * 100) / 10;
        int c = num % 10;
        System.out.println("백의 자리 수 : " + a + " | 십의 자리 수 : " + b + " | 일의 자리 수 : " + c);

    }
}
