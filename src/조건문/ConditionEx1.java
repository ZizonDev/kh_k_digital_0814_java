package 조건문;
// 조건문 : 조건을 만족하는 경우와 그렇지 않은 경우로 나누어 조건별로 수행하는 것.


import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력하세요 : ");
//        int num = sc.nextInt();
//        if (num > 100) {
//            System.out.println(num + "은 100보다 큰 수 입니다.");
//        }
//        else if (num < 100) {
//            System.out.println(num + "은 100보다 작은 수입니다.");
//        }
//        else {
//            System.out.println(num + "은 100입니다.");
//        }
//    }
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);                          // sc.next().charAt(0) 외워라!!!!!!!!
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 알파벳 소문자 입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 알파벳 대문자 입니다.");
        } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");
        }
    }
}