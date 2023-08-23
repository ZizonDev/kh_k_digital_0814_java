package 영화표예매;

import java.util.Scanner;

public class MovieTicket {
    int seat[] = new int[10];              // 인스턴스 필드, 좌석의 개수
    int ticketPrice;
    MovieTicket(int price) {ticketPrice = price;}

    //메소드 생성
    int totalAmount() {
        int cnt = 0;                       // 지역변수라고 함.
        for(int val : seat) {              // 변수 val는 배열 seat를 처음부터 마지막까지 순회하는 요소.
            if (val == 1) cnt++;           // val이 1이면 판매된 좌석이라는 의미. (판매된 좌석의 개수 확인)
        }
        return cnt * ticketPrice;          // 10개 몇 개가 판매됐는지를 counting하여 좌석 가격만큼을 곱하면 총 판매 금액. (반환값은 int형.)
    }
    void printSeat() {                     // 선택 가능한 좌석의 list를 보여줌.
        for (int S : seat) {
            if (S == 0) {System.out.print("[ ]");}        // 아직 판매가 안 된 좌석
            else System.out.print("[V]");                 // 이미 판매된 좌석
        }
        System.out.println();
    }
    void selectSeat() {                    // 좌석을 판매하는 메뉴
        printSeat();                       // 현재 좌석의 상태를 보여주는 메소드 호출.
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택하세요 : ");
        int selSeat = sc.nextInt();        // 유저가 선택한 좌석을 입력받는 것. (유저는 숫자 1부터 생각함!!! but index는 0부터 시작.)
        if (seat[selSeat-1] == 0) {        // 유저가 선택한 좌석이 판매되었는지 확인.
            seat[selSeat-1] = 1;           // 판매 안되었던 좌석이기 때문에 판매로 바꾸어줌.
            printSeat();                   // 판매 후 좌석 상태를 다시 보여줌.
        } else System.out.println("이미 선택된 좌석입니다. 다른 좌석을 선택하세요.");         // 유저가 이미 선택된 좌석을 고른 경우.
    }
}
