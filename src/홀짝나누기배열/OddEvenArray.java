package 홀짝나누기배열;
/*
    [문제]
    -7개의 정수를 입력 받는다.
    -7개의 정수를 입력 받는 메소드를 만든다.
    -홀수와 짝수 배열로 나누어 담는 메소드를 만든다.
    -홀수와 짝수를 출력하는 메소드를 만들어 보자.
    -클래스를 생성해서 만들기.

    [입력]
    입력 : 1 2 3 4 5 6 7

    [출력]
    홀수 : 1 3 5 7
    짝수 : 2 4 6
 */

public class OddEvenArray {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        oddEven.InputNum();
        oddEven.OddOrEven();
        oddEven.PrintNum();
    }
}
