package 커피메뉴만들기;

public class MenuInfo {
    String name;          // 메뉴 이름
    int price;
    String category;
    String description;

    public MenuInfo(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
}
