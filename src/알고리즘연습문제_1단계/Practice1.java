package 알고리즘연습문제_1단계;

import java.util.Scanner;

/*
23.08.16
### 한번에 정수 여러개 입력 받아서 합계 구하기 (입출력과 반복문)

- 문제 설명
 **정수의 개수을 입력 받고 정수의 개수 만큼의 값을 입력 받은 것의 총 합을 구하는 문제 입니다.**

- 표준 입출력에 대한 사용 방법을 복습한다.
- 여러 개의 입력을 받기 위해서는 입력의 개수와 반복문이 필요한다.
- 반복문의 기본적인 사용 방법을 복습한다.
- 합계를 구하기 위해서는 추가적인 변수가 필요하고 반드시 초기화 되어 있어야 한다.
 */
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수의 개수를 입력하세요 : ");
        int num = sc.nextInt();                         // num이 사용자가 입력한 정수의 개수가 될 것임.
        int sum = 0;                                    // 문제에서 요구하는 solution을 나타내는 새로운 변수 추가 & 초기화!!!
        for (int i = 0; i < num; i++) {                 // for 반복문 (초기화문; 조건문; 증감문) { }
            int tmp = sc.nextInt();                     // i가 0 부터 사용자가 입력한 num 까지의 합을 반복하기 위한 추가 변수 tmp.
            sum += tmp;
        }
        System.out.println("합계 : " + sum);
    }
}
