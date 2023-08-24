package 매개변수다형성1;

import java.util.Scanner;

public class BuyerExMain {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("[1]TV [2]Computer [3]Audio [4]Quit : ");
            int selection = sc.nextInt();
            switch(selection) {
                case 1 :
                    buyer.buy(tv);
                    buyer.viewInfo();
                    break;
                case 2 :
                    buyer.buy(computer);
                    buyer.viewInfo();
                    break;
                case 3 :
                    buyer.buy(audio);
                    buyer.viewInfo();
                    break;
                case 4 :
                    System.out.println("제품 구매를 종료합니다.");
                    return;                             // break걸면 아래 조건으로 내려가고 return걸면 아예 스위치문을 빠져나감.
                default :
                    System.out.println("해당 제품이 없습니다.");
            }
        }
    }
}
