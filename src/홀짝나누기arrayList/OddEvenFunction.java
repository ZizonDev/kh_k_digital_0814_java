package 홀짝나누기arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenFunction {
    List<Integer> input = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    public void inputFunction() {
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            input.add(sc.nextInt());
        }
    }
    public void oddEvenCalc() {
        for(Integer e : input) {
            if(e % 2 == 0) even.add(e);
            else odd.add(e);
        }
    }
    public void oddEvenPrint() {
        System.out.print("홀수 : ");
        for(Integer e : odd) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : even) System.out.print(e + " ");
    }
}
