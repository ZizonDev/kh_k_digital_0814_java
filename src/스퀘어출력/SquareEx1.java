package 스퀘어출력;
// Input : 3
// Output
// 1 2 3
// 4 5 6
// 7 8 9


import java.util.Scanner;

public class SquareEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();
        }
    }
}
