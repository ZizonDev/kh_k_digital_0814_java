package 영화표예매;
// 간단한 영화표 예매 시스템에 대한 예제입니다.
// 사용자는 극장의 좌석을 선택하고, 선택한 좌석 개수만큼 판매 금액을 계산합니다.
// 1. 예매하기 & 종료하기 메뉴 만들기.   (종료하기 선택 시 총 판매 금액을 계산함.)
// 2. 극장의 좌석은 총 10개.
// 3. 각 좌석당 판매 가격은 12000원.

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {                    // MovieTicket이라는 클래스를 이용하여 ticket이라는 객체 생성.
        MovieTicket ticket = new MovieTicket(13000);      // price라는 생성자를 추가하여 좌석당 가격을 정할 수 있음.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            System.out.print("-> ");
            if (sc.nextInt() == 1) ticket.selectSeat();
            else {System.out.println("총 판매 금액 : " + ticket.totalAmount());
            break;}
        }

    }
}
