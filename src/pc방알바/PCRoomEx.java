package pc방알바;
/*
    [입력] 인원 수, 예약할 좌석 번호 (maximum 100)
    [출력] 거절 횟수
 */

import java.util.Scanner;

public class PCRoomEx {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];
        int rejectCnt = 0;
        int seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();                 // 인원 수를 입력 받음.
        for (int i = 0; i < num; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum-1] == 1) {
                rejectCnt++;
            } else {
                pcRoom[seatNum-1] = 1;
            }
        }
        System.out.println(rejectCnt);
    }
}
