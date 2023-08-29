package 다중인터페이스;

public class Car {
    protected int speed;            // protected로 접근제한자를 설정해주면 이 필드는 뭔가 상속을 주기 위한 클래스임을 알려주는 느낌.
    protected String color;
    protected String year;
    public Car() {
        speed = 150;
        color = "white";
        year = "1999";
    }
}
