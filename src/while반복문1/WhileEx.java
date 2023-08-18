package while반복문1;
// 주어진 조건이 참인 동안 해당 블록{ }을 반복 수행(block scope), 주로 반복 횟수를 알 수 없는 경우에 사용.

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 입력을 받기 위한 스캐너 생성.
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        int sum = 0;                                // 합계를 구한 변수를 초기화. sum은 블록 안에서만 쓰이는 지역 변수. 지역 변수의 특징 1.할당했을 때 메모리를 초기화하지 않는다. 2.범위를 벗어나면 자동 소멸.
//        while (n> 0) {
//            sum += n;                               // sum = sum + n; 바로 위의 sum 초기화 값이 없다면 좌변의 sum까지는 괜찮지만 우변의 sum + n을 반복 수행하는 과정에서 error 발생.
//            n--;                                    // while문 탈출 조건. 입력받은 값을 1씩 감소시킴.
        for(int i = 1; i <= n; i++) {                   // for(초기화식; 조건식; 증감식)
            sum += i;
        }
        System.out.println("주어진 정수까지의 합 : " + sum);     //for문과 while문은 같다.
    }
}


