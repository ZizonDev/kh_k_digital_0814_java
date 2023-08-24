package 호수판너비구하기;

import java.util.Scanner;

/*
    [문제]
    고객에게 전달할 호수판은 숫자와 숫자 사이 그리고 왼쪽 오른쪽으로 적당히 여백이 들어가 줘야하고 숫자마다 차지하는 간격이 조금씩 상이하다.
    규칙은 다음과 같다.
    1. 각 숫자 사이에는 1cm의 여백이 들어가야한다.
    2. 1은 2cm의 너비를 차지해야한다. 0은 4cm의 너비를 차지해야한다. 나머지 숫자는 모두 3cm의 너비를 차지한다.
    3. 호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.

    [입력]
    호수판에 들어갈 숫자 N의 범위는 1 ≤ N ≤ 9999 이다.
    입력은 마지막에 0이 들어오기 전까지 계속해서 줄 단위로 주어진다.
    또한, 마지막의 0은 처리하지 않는다.

    [출력]
    각 입력마다 얼마만큼 너비를 차지하는지 정수로 출력하면 된다.
    각 출력은 줄바꿈으로 구분되어야한다.
 */
public class AddressBoardWidth {
    public static void main(String[] args) {
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};  // 각 숫자가 차지하는 자리 수를 배열로 만들기.
        int width = 0;                          // 입력 받은 수가 차지하는 총 자리 수. (호수판의 너비)
        Scanner sc = new Scanner(System.in);
        while(true) {
            String addrNum = sc.next();
            if(addrNum.equals("0")) break;      // 0을 입력하면 프로그램이 끝남. (탈출 조건)
            for(int i = 0; i < addrNum.length(); i++) {
                width += numSize[addrNum.charAt(i) - '0'] + 1;  // if addrNum으로 0이 들어오면 4를 더해주고 addrNum은 String이므로 아스키코드 0만큼을 빼면 정수가 출력된다.
                                                                // 1을 더하는 이유 : 각 숫자마다 여백이 1칸임을 표시
            }
            System.out.println(width + 1);                      // 1을 더하는 이유 : 처음 공백을 더해줌.
            width = 0;                                          // 다음 계산을 위해 width를 초기화시킴.
        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("호수판에 들어갈 숫자를 입력하세요 : ");
//        int addrNum = sc.nextInt();
//        int[] board = new int[]{};
//        int width;
//        for (int i = 0; i < board.length; i++) {
//            if (board[i] = '0') { width = 4; }
//            else if (board[i] = '1') { width = 2; }
//            else { width = 3; }
//
//        }
    }
}


