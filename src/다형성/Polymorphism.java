package 다형성;

public class Polymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        Parent p = new Child();             // 부모 클래스의 참조변수 p를 갖고, 자식 클래스에 접근하는 경우.
                                            // 자식 객체는 부모 클래스로부터 상속받았기 때문에 가능함.
//        p.out();                            // p는 부모 클래스 소속이므로 out 메소드를 쓸 수 없음.
        p.display();                        // 원래 부모 클래스의 기능이었던 display만 가능함.
                                            // 그럼 display()는 누구 것이 불려질까? => child 클래스의 업그레이드 된 display 적용됨!!!
    }
}