package 객체타입확인;
// instanceof : 주로 상속 관계에서 부모 객체인지 자식 객체인지 확인. 상속 관계가 성립하는지 확인하는 용도.
// 왼쪽 피연산자가 오른쪽 피연산자의 인스턴스인지를 검사하며, 결과는 boolean 값(true of false)으로 반환됩니다.

public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent);       // Parent 클래스의 parent 객체가 인스턴스냐? true.
        System.out.println(parent instanceof Child);        // false.
        System.out.println(child instanceof Parent);        // true.
        System.out.println(child instanceof Child);         // true.
    }
}

class Parent {
    String name;
    Parent(String name) {       // 부모 객체에서 명시적으로 생성자 생성한 경우, 아래 자식 객체에서도 super를 이용하여 생성자를 명시해주어야.
        this.name = name;
    }
}

class Child extends Parent {
    Child(String name) {
        super("부모");            // this는 자기 자신, super는 부모 객체를 의미함.
        this.name = name;
    }
}

