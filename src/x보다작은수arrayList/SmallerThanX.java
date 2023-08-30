package x보다작은수arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    [문제]
    정수 N개로 이루어진 배열 A와 정수 X가 주어진다. 이 때 A에서 X보다 작은 수를 모두 출력하는 프로그램 만들기.

    [입력]
    첫째 줄에 N과 X가 주어진다. (1 <= N,X <= 10000)
    둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10000보다 작거나 같은 정수이다.

    [출력]
    X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
    X보다 작은 수는 적어도 하나 존재한다.
 */
public class SmallerThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
//        System.out.print("배열의 수 N, 기준 값 X 입력 : ");
        int n = sc.nextInt(); int x = sc.nextInt();
//        System.out.print("N개의 정수로 이루어진 수열 A 입력 : ");
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
            if (a.get(i) < x) System.out.print(a.get(i) + " ");
        }
        System.out.println();
//        if (n < 1 || x > 10000) {
//            System.out.println("정수의 범위는 1 <= N,X <= 10000 입니다.");
//        }
//        for(int i = 0; i < n; i++) {
//            if (a.get(i) < x) array.add(a.get(i));
//        }
//        for(int e : array) System.out.print(e + " ");


        // stream 활용하기!!!
        System.out.println();
        a.stream().filter(i -> i < x).forEach(e -> System.out.print(e + " "));
    }
}
