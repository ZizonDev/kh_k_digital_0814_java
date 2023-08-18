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
            for(int j = 0; j < i+1; j++) {          // i가 0부터 시작함. -> i=0이면 j=1, 즉 별 한 번 찍고 다음줄로내려감. -> i가 1 증가함. -> i=1이면 j=2 -> ... -> j=n까지
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
