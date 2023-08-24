package super메소드;
// super : 자식 클래스 멤버가 부모 클래스의 필드나 메소드에 접근할 때 사용.  ->  x
// super() : 자식 클래스 멤버가 부모 클래스의 생성자를 호출할 때 사용.      ->  a, n, b

public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();              // child가 생성될 때 이미 parent도 생성된 이후임.
        child.childMethod();
        child.display();
    }
}

class Parent {
   int x = 10;
   //////////////////////////////////////////////////////////////////////
   int a;
   Parent() {
       a = 10;
   }
   Parent(int n) {
       a = n;
   }
}

class Child extends Parent {
   int x = 20;
   void childMethod() {
       System.out.println("x : " + x);              // 자식 필드에 접근하므로 결과는 20.
       System.out.println("x : " + this.x);         // 위의 경우와 완벽하게 동일함. 원래 this가 숨어 있었음.
       System.out.println("x : " + super.x);        // 부모 필드에 접근하므로 결과는 10.
   }
   ///////////////////////////////////////////////////////
   int b;
   Child() {
       super(100);                              // super를 이용하여 부모의 생성자 n을 호출할 수 있다.
       b = 20;                                     // super를 쓰면 100이 나오고, super를 쓰지 않으면 10이 나온다.
   }
   void display() {
       System.out.println("a : " + a);
       System.out.println("b : " + b);
   }

}