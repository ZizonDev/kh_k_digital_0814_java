package 디폴트메소드;

import java.util.Scanner;
public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1]Audio [2]TV : ");
        int selection = sc.nextInt();
        RemoteController rc;
        if(selection == 1) {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(30);
            rc.setMute(true);
            RemoteController.changeBattery();
        } else {
            rc = new Television();
            rc.turnON();
            rc.setVolume(20);
        }

        // 객체 만들 시간 없는데 빨리 리모컨 만들어야 하는 상황ㅋㅋ
        RemoteController ps5 = new RemoteController() {        // 익명 객체로 플스5 리모컨 만든 것.
            @Override
            public void turnON() {
                System.out.println("플스5를 켭니다.");
            }

            @Override
            public void turnOFF() {
                System.out.println("플스5를 끕니다.");
            }

            @Override
            public void setVolume(int vol) {

            }
        };
        ps5.turnON();
        ps5.turnOFF();
    }
}
