package iPad주문하기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class IPadPro {
    int screen;         // 11인치, 12.9인치
    int color;          // 스페이스그레이, 실버
    int memory;         // 128GB, 256GB, 512GB, 1TB
    int network;        // Wi-fi only 모델, Wi-fi + Cellular 모델
    String name;        // 각인 서비스
    String productDate; // 제품 생산 일자, 생성자가 생성될 시기를 제품 생산 일자로.
    String serialNum;   // 제품의 일련 번호 (고유값, 중복x)
    static int cnt = 0; // 인스턴스가 아닌 class 소속의 변수 static, 제품 생산 대수 (즉 class가 객체로 생성된 횟수 counting.)

    IPadPro (String name) {
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now);          // 생산한 년/월/일을 가져옴.
        cnt++;                                  // 생성자를 생성할 때 counting.
        productDate += cnt;                     // 문자열에 생산대수를 이어 붙이기.
    }

    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(11) + " iPad Pro 구입하기 " + "=".repeat(11));
        System.out.print("구입하시려면 yes / 종료하시려면 quit를 입력하세요 : ");
        String isContinue = sc.next();
        if (isContinue.equalsIgnoreCase("yes")) return true;        // 구입을 진행함.
        else return false;                                                      // 구입하지 않음.
    }

    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(11) + " 화면 크기 선택하기 " + "=".repeat(11));
            System.out.print("[1] 11인치, [2] 12.9인치 : ");
            screen = sc.nextInt();
            if (screen == 1 | screen == 2) return;
            System.out.println("화면 크기를 다시 선택하세요.");
        }
    }

    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(13) + " 색상 선택하기 " + "=".repeat(13));
            System.out.print("[1] 스페이스그레이, [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 | color == 2) return;
            System.out.println("색상을 다시 선택하세요.");
        }
    }

    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(11) + " 저장 용량 선택하기 " + "=".repeat(11));
            System.out.print("[1] 128GB, [2] 256GB, [3] 512GB, [4] 1TB : ");
            memory = sc.nextInt();
            if (memory > 0 && memory < 5) return;
            System.out.println("저장 용량을 다시 선택하세요.");
        }
    }

    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(11) + " 네트워크 선택하기 " + "=".repeat(11));
            System.out.print("[1] Wi-fi only, [2] Wi-fi + Cellular : ");
            network = sc.nextInt();
            if (network == 1 | network == 2) return;
            System.out.println("네트워크를 다시 선택하세요.");
        }
    }

    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(10) + " 각인 서비스 선택하기 " + "=".repeat(10));
        System.out.print("각인 서비스를 신청하시겠습니까? (yes / no) : ");
        String service = sc.nextLine();
        if(service.equalsIgnoreCase("yes")) {
            System.out.print("각인할 문구를 입력하세요 : ");
            name = sc.nextLine();
        }
    }
    // boilerplate : 비슷한 코드가 반복적으로 나타나는 것.

    void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memoryStr = {"", "128", "256", "512", "1024"};
        String networkStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memoryStr[memory] + networkStr + productDate;  // 일련 번호 생성.
    }

    void progressIPad() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(200);                 // (200/1000)초 동안 프로그램 잠 재우기.
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [ "  + cnt + "% ] >> ");
            System.out.print("\r");
            if (cnt >= 100) break;
        }
    }

    void productIPad() {
        final String[] screenType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스그레이", "실버"};
        final String[] memoryType = {"", "128GB", "256GGB", "512GB", "1TB"};
        final String[] networkType = {"", "Wi-fi only", "Wi-fi + Cellular"};

        System.out.println("=".repeat(12) + " iPad Pro 사양 " + "=".repeat(12));
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("저장 용량 : " + memoryType[memory]);
        System.out.println(" 네트워크 : " + networkType[network]);
        System.out.println(" 각  인  : " + name);
        System.out.println("일련 번호 : " + serialNum);
        System.out.println("-".repeat(40));
    }
}
