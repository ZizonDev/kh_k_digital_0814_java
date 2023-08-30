package 홀짝나누기arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenMain {
    public static void main(String[] args) {
//        OddEvenFunction oddEven = new OddEvenFunction();
//        oddEven.inputFunction();
//        oddEven.oddEvenCalc();
//        oddEven.oddEvenPrint();

        // Upgrade Version!!!
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("입력 : ");
        for(int i = 0; i < 7; i++) list.add(sc.nextInt());
        System.out.print("홀수 : ");
        // stream생성단계.중계연산.최종연산
        list.stream()
                .filter(n -> n % 2 != 0)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter(n -> n % 2 == 0).forEach(e -> System.out.print(e + " "));
    }
}
