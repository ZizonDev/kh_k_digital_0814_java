package 저항;

import java.util.Scanner;

/*
    [문제]
    전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
    처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다. 저항의 값은 다음 표를 이용해서 구한다.
    <   color   >  <    값    >  <    곱    >
        black           0             1
        brown           1            10
        red             2            100
        orange          3           1,000
        yellow          4           10,000
        green           5          100,000
        blue            6         1,000,000
        violet          7         10,000,000
        grey            8        100,000,000
        white           9       1,000,000,000

        [입력]
        첫째 줄에 첫 번째 색, 둘째 줄에 두 번째 색, 셋째 줄에 세 번째 색이 주어진다. 위의 표에 있는 색만 입력으로 주어진다.

        [출력]
        입력으로 주어진 저항의 저항값을 계산하여 첫째 줄에 출력한다.
        예를 들어, 저항의 색이 yellow, violet, red였다면 저항의 값은 4,700이 된다.
 */
public class ColorResistance {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int first = 0, second = 0, third = 0;
        Scanner sc = new Scanner(System.in);
        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String thirdColor = sc.nextLine();
        for(int i = 0; i < color.length; i++) {
            if(firstColor.equalsIgnoreCase(color[i])) first = i;        // 첫 번째로 입력받은 color 문자열의 index 구하기, 십의 자리.
            if(secondColor.equalsIgnoreCase(color[i])) second = i;      // 두 번째로 입력받은 color 문자열의 index 구하기, 일의 자리.
            if(thirdColor.equalsIgnoreCase(color[i])) third = i;        // 세 번째로 입력받은 color 문자열의 index 구하기, 곱하는 수.
        }
        System.out.println(  (long)((first * 10) + second) * (long)(Math.pow(10, third))  );      // Math.pow(10, third) == 10^(third)
                                // java에서 int는 21억 정도까지만 표현되므로 long형 정수 타입을 써줘야 100억 단위도 표시 가능함!!!

        System.out.println( Integer.toString(first) + Integer.toString(second) + "0".repeat(third) );


//        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//        int[] zeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int x = 0, y = 0;
//        String z = "", result = "";
//        Scanner sc = new Scanner(System.in);
//        String firstColor = sc.nextLine();
//        String secondColor = sc.nextLine();
//        String thirdColor = sc.nextLine();
//        for (int i = 0; i < 10; i++) {
//            if (colors[i].equalsIgnoreCase(firstColor)) { x = i; }
//            else if (colors[i].equalsIgnoreCase(secondColor)) {y = i;}
//            else if (colors[i].equalsIgnoreCase(thirdColor)) { z = zeros[i]; }
//        }
//        result = x + y + z;
//        System.out.println(result);

    }
}







