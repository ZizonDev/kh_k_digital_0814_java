package 추상클래스2;

public class SmartPhone extends Phone {
    public SmartPhone(String name) {
        super(name);                        // 부모의 생성자를 호출해줘야 함.
    }
    @Override
    void call() {                           // 추상 메소드 call을 오버라이딩해야 함.
        System.out.println("Embodying Call Method...");
        System.out.println("Complete Call Method!");
    }
    public void internet() {
        System.out.println("Search Internet");
    }
}
