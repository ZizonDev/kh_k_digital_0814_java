package 커피메뉴만들기;
// Hash Map으로 커피 메뉴 만들기.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenu {
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        makeMenu();                 // 같은 클래스 내부에 존재하므로 앞에 CoffeeMenu가 없어도 가능하다.
        selectMenu();
    }
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 3500, "Coffee", "콜롬비아 원두를 사용한 커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2700, "Coffee", "에티오피아 원두 투 샷"));
        map.put("ChocoLatte", new MenuInfo("ChocoLatte", 4800, "Coffee", "휘핑이 올라간 초코 라떼"));
    }
    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key = "";            // key 값을 받기 위한 문자열 변수.
        while (true) {
            System.out.println("=".repeat(30) + " MENU MAKER " + "=".repeat(30));
            System.out.print("[1]메뉴 보기 [2]선택 메뉴 조회 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1 :
                    System.out.println("=".repeat(30) + " MENU  LIST " + "=".repeat(30));
                    for(String e : map.keySet()) {
                        System.out.println("MENU        : " + map.get(e).name);
                        System.out.println("PRICE       : " + map.get(e).price);
                        System.out.println("CATEGORY    : " + map.get(e).category);
                        System.out.println("DESCRIPTION : " + map.get(e).description);
                        System.out.println("-".repeat(72));
                    } break;
                case 2 :
                    System.out.println("=".repeat(30) + " CHECK MENU " + "=".repeat(30));
                    System.out.print("조회할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {                // map.containsKey : map 안에 해당 key가 있는지 여부를 반환함.
                        System.out.println("MENU        : " + map.get(key).name);
                        System.out.println("PRICE       : " + map.get(key).price);
                        System.out.println("CATEGORY    : " + map.get(key).category);
                        System.out.println("DESCRIPTION : " + map.get(key).description);
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3 :
                    System.out.println("=".repeat(30) + " ADD MENU " + "=".repeat(30));
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {               // 이미 메뉴가 존재하면 추가하지 않고 메뉴 수정 옵션으로 넘어가야 됨.
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print("Set Price : ");
                        int price = sc.nextInt();
                        System.out.print("Set Category : ");
                        String category = sc.next();
                        sc.nextLine();                     // 버퍼 비우기.
                        System.out.print("Set Description : ");
                        String description = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, category, description));
                    }
                    break;
                case 4 :
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + "메뉴를 삭제하였습니다.");
                    } else System.out.println("삭제할 메뉴가 존재하지 않습니다.");
                    break;
                case 5 :
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    System.out.print("Set Name : ");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.print("Set Price : ");
                    int price = sc.nextInt();
                    System.out.print("Set Category : ");
                    String category = sc.next();
                    sc.nextLine();                     // 버퍼 비우기.
                    System.out.print("Set Description : ");
                    String description = sc.nextLine();
                    map.remove(key);
                    map.put(name, new MenuInfo(name, price, category, description));
                    break;
                case 6 :
                    System.out.println("메뉴를 종료합니다.");
                    System.exit(0);         // 프로그램 강제 종료. () 안에 0은 실제 zero 값이 아니라 운영체제가 받아들이는 값이라서 사실 우리는 아무 숫자나 넣어도 괜찮다고 하심.
                default : System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}
