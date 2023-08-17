package 가장큰숫자추출하기;
/*
세자리의 정수를 입력 받아 가장 큰 수 출력
 */
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int num;    // 백의 자리 정수 입력을 받기 위한 변수
        int a, b, c;    // 백, 십, 일의 자리 값을 담기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 정수 입력 : ");
        num = sc.nextInt();
        a = num / 100;  // 100으로 나눈 몫
        b = (num % 100) / 10;
        c = num % 10;

        if(a > b) {
            if(a > c) System.out.println(a);
            else System.out.println(c);
        }
        else {
            if(b > c) System.out.println(b);
            else System.out.println(c);
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("세 자리 정수를 입력하세요 : ");
//        int num = sc.nextInt();
//        if((num / 100) >= 10 | num < 100){
//            System.out.println("숫자를 잘못 입력하셨습니다.");
//        }
//        else if(num / 100 >= (num % 100) / 10 && num / 100 >= num % 10) {
//            System.out.println("가장 큰 숫자는 " + (num / 100) + " 입니다.");
//        }
//        else if((num % 100) / 10 >= num / 100 && (num % 100) / 10 >= num % 10) {
//            System.out.println("가장 큰 숫자는 " + (num % 100) / 10 + " 입니다.");
//        }
//        else if(num % 10 >= num / 100 && num % 10 >= (num % 100) / 10) {
//            System.out.println("가장 큰 숫자는 " + (num % 10) + " 입니다.");
//        }
//    }
}
