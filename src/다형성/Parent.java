package 다형성;

public class Parent {                           // 사실 Parent도 상속받고 있다. default값인 extends Object 생략된 것.
    protected int num;                          // protected : 다른 패키지라도 상속 관계면 접근 가능. 즉, 자식이 사용 가능함. (같은 패키지 안이면 당연히 사용 가능함.)
    // protected를 걸면 다른 패키지에 Parent가 있더라도 Child가 쓸 수 있음.
    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}
