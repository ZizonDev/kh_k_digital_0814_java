package 계산기만들기;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        int x, y;               // x는 좌변, y는 우변.
        char op;                // op는 연산자.
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 입력 : ");
        x = sc.nextInt();                                                 // 세 개의 next 인자는 공백으로 구분됨. 즉, 입력할 때 x 띄우고 op 띄우고 y 입력해야됨
        op = sc.next().charAt(0);                                         // nextLine만 줄바꿈 문자
        y = sc.nextInt();                                                 // 그래서 next, next붙어 있을 때는 nextLine방식 즉 엔터로 입력하면 좋음.
        switch(op) {
            case '+' :
                System.out.println("덧셈 : " + (x + y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x - y));
                break;
            case '*' :
                System.out.println("곱셈 : " + (x * y));
                break;
            case '/' :
                System.out.println("나눗셈 : " + ((double)x / y));         // (double)꼭 추가할 것!!!
                break;
            default :
                System.out.println("연산자를 잘못 입력하셨습니다.");
        }
    }
}
