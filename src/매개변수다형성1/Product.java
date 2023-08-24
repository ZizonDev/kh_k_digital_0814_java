package 매개변수다형성1;

public class Product {                      // 부모 클래스 Product
    int price;
    int bonusPoint;
}

class TV extends Product {                  // 자식 클래스들 (TV, Computer, Audio)
    TV() {
        this.price = 100;
        this.bonusPoint = 10;
    }
}

class Computer extends Product {
    Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}

class Audio extends Product {
    Audio() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}