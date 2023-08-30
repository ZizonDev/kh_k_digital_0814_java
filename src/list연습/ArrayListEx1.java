package list연습;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // List 인터페이스의 참조변수 <MenuInfo>로 ArrayList 객체를 참조함.
        List<MenuInfo> menuInfoList = new ArrayList<>();
        // add : 객체를 추가함. 추가할 때마다 크기가 변함.
        menuInfoList.add(new MenuInfo("Americano", 2500, "coffee", true));      // menuInfo1
        menuInfoList.add(new MenuInfo("ChocoLatte", 4000, "coffee", true));     // menuInfo2
        menuInfoList.add(new MenuInfo("BlackTea", 3800, "tea", true));          // menuInfo3
        MenuInfo menuInfo4 = new MenuInfo("GreenTea", 3500, "tea", true);       // 기존엔 생성자를 새로 만들어서 그걸 add()에 대입했다. add() 안에 바로 넣어도 된다.
        menuInfoList.add(menuInfo4);
        for(MenuInfo menu : menuInfoList) {             // 향상된 for문 : 배열 또는 Collection 소속 클래스일 때만 가능함.
            System.out.println(menu.GetMenuInfo());
        }
        for(int i = 0; i < menuInfoList.size(); i++) {  // 일반 for문. 향상된 for문과 결과는 같다.
            System.out.println( menuInfoList.get(i).GetMenuInfo() );
        }
    }
}

class MenuInfo {
    String name;
    int price;
    String category;
    String description;
    boolean isTax;

    public MenuInfo(String name, int price, String category, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isTax = isTax;
    }
    public String GetMenuInfo() {
        return "{" + "\"name\" : " + name + " // " + "\"price\" : " + price + " // " + "\"isTax\" : " + isTax + "}";
    }
}