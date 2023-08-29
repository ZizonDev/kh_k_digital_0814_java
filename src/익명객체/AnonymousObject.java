package 익명객체;
// java에서 이름없는 객체는 주로 일회성으로 객체를 생성해야 할 때 사용함.

public class AnonymousObject {
    public static void main(String[] args) {
        A a = new A();

    }
}
class Parent {
    String name = "Parent Class";
    void methodParent() {
        System.out.println("Parent Method : " + this.name);
    }
}
class A {
    Parent field = new Parent() {               // 익명의 자식 클래스 생성.
        int childField;
        void methodChild() {}
        @Override
        void methodParent() {}
    };
}
