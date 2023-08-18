package 공백없는숫자합;
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
// 첫째 줄에 숫자의 개수 N(1 <= N <= 100)이 주어진다. 둘째 줄에 숫자 N개가 공백 없이 주어진다.
// 입력으로 주어진 숫자 N개의 합을 출력한다.
// [힌트] 입력을 문자열로 간주해야 함. 문자열에서 하나의 문자를 추출해야 함. '0'이 35라고 가정할 때 추출한 문자가 '1'이라면 '1' -> 36.

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();
        int sum = 0;
        for(int i=0; i < n; i++){                   // n 대신 number.length()를 사용해도 된다.
            sum += number.charAt(i) - '0';          // 문자 '0'에 대한 정수값(아스키 코드 값)이 존재한다. 문자의 숫자가 1씩 커질 때 아스키 코드도 1씩 차이남. 그래서 i=0 이면 0번째 문자에 대한 정수값이 나오게 됨.
        }
        System.out.println(sum);

    }

}