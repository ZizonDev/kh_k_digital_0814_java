package 코코아톡만들기;

import java.util.Scanner;

public class KoKoaMain {
    public static void main(String[] args) {
        KokoaTalk kokoaTalk = new KokoaTalk("김예령");
        kokoaTalk.writeMsg("오늘 아침에 갑자기 비옴. 근데 10분 만에 그침. 돈 괜히 썼음. (-_-^^)");
        NetworkAdapter adapter;                             // 상속을 주기 위한 인터페이스.
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 연결 [1]Wifi [2]5G : ");
        int selection = sc.nextInt();
        if(selection == 1) adapter = new WiFi();           // 상속 준 인터페이스를 통해 자식 객체에 접근.
        else adapter = new FiveG();
        adapter.connect();
        kokoaTalk.send(adapter);
    }
}
