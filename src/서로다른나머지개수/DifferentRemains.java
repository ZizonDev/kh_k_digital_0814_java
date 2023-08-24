package 서로다른나머지개수;

import java.util.Scanner;

/*
    [문제]
    두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
    수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

    [입력]
    첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1000보다 작거나 같고, 음이 아닌 정수이다.

    [출력]
    42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 */
public class DifferentRemains {
    public static void main(String[] args) {
        int[] arr = new int[42];            // 42로 나누면 나머지가 될 수 있는 경우의 수는 총 42가지.
        int cnt = 0;                        // 서로 다른 나머지의 총 개수.
        int input;                          // 입력 받은 값.
        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 수 입력 : ");
        for (int i = 0; i < 10; i++) {
            input = sc.nextInt();
            arr[input % 42] = 1;            // if input에 42가 들어오면 arr의 0번째 방에 1이 들어오는 거임. 84가 들어오면 또 0번째 방에 1이 들어오는데 이미 0번째 방에 1있으니까 눈으로 보이는 변화는 없을듯.
        }
        for (int val : arr) cnt += val;     // 1로 바뀐 애들만 cnt에 더해주는 거임. 여기서 val은 arr의 인덱스라고 보면 될듯.
        System.out.println(cnt);


//        int cnt = 0;
//        Scanner sc = new Scanner(System.in);
//        String nums = sc.nextLine();
//        char[] remains = nums.toCharArray();
//
//        while(true) {
//            for (int i = 0; i < remains.length; i++) {
//                int r = remains[i] % 42;
//                boolean isExist = ( remains[i] == (int)'r');
//                if (isExist = false) cnt += 1;
//            }
//            if (remains.length == 10) break;
//        }
//        System.out.println(cnt);
    }
}