package 인터페이스;

import java.util.Scanner;

public class InterfaceBasic {
    public static void main(String[] args) {
        NetworkAdapter adapter;                 // 완전 추상화가 적용된 인터페이스. 느슨한 결합관계.
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크를 선택하세요. [1]LAN [2]Wi-Fi [3]5G : ");
        int selection = sc.nextInt();
        switch (selection) {
            case 1 :
                adapter = new LAN("KT Mega Pass");
                adapter.connect();
                break;
            case 2 :
                adapter = new WiFi("SK Telecom");
                adapter.connect();
                break;
            case 3 :
                adapter = new FiveG("LG U+");
                adapter.connect();
                break;
            default :
                System.out.println("선택한 네트워크가 없습니다.");
        }
    }
}
