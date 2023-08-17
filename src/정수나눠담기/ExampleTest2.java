package 정수나눠담기;
/*
100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기
 */
import java.util.Scanner;

public class ExampleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 자리 정수 입력 : ");
        int num = sc.nextInt();
        int a = num / 100;                    // 100으로 나눈 몫을 구하면 백의 자리 수 나옴.
        int b = (num % 100) / 10;             // 100으로 나눈 나머지를 10으로 나눈 몫이 십의 자리 수!!!!!
        int c = num % 10;                     // 10으로 나눈 나머지 자체가 일의 자리 수!!!!!
        System.out.println("백의 자리 : " + a + " | 십의 자리 : " + b + " | 일의 자리 : " + c);

    }
}
