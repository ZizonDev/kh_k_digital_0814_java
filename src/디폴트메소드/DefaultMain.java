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
    }
}
