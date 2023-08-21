package 별찍기;

import java.util.Scanner;

//  삼각형 별 찍기
// 입력받은 수만큼 별 찍기
// ex) 5를 입력하면
//*
//* *
//* * *
//* * * *
//* * * * *

public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별 개수 입력 : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {          // i=0 -> j=0일 때만 참. -> i=1 -> j=0, j=1일 때만 참. -> ... -> i=n-1 -> j=0 ~ j=n-1일 때만 참.
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
