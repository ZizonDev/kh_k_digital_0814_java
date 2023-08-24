package 매개변수다형성1;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) {                   // 구매 행위를 나타내는 메소드, 부모 클래스의 참조 변수로 자식 객체에 접근 가능.
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}
