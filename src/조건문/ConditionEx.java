package 조건문;
// 조건문 : 조건을 만족하는 경우와 그렇지 않은 경우로 나누어 조건별로 수행하는 것.


import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력하세요 : ");
//        int num = sc.nextInt();
//        if (num > 100) {
//            System.out.println(num + "은 100보다 큰 수입니다.");
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
        if (ch >= 'a' && ch <= 'z') {                           // if의 조건문에 값(A > B)이 올 수도 있고, 조건(A && B, A || B)이 올 수도 있다. (if-else문의 장점)
            System.out.println(ch + "는 알파벳 소문자입니다.");     // but if-else문은 가독성 떨어짐. 될 수 있으면 삼항 연산자가 좋음. 특히 프론트엔드에서.
        } else if (ch >= 'A' && ch <= 'Z') {                    // 그 다음으로 추천하는게 switch-case문. 두 개 다 안 되면 그 때 if-else문.
            System.out.println(ch + "는 알파벳 대문자입니다.");
        } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");
        }
    }
}