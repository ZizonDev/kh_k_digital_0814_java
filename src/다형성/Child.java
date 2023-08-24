package 다형성;

public class Child extends Parent {
    private int x = 100;            // 접근제한자가 private이므로 main에서 보이지 않았음.
    public Child() {}               // 생성자도 메소드이므로 접근제한자 설정 가능. 만약 private 생성자 하면 생성자를 외부에서 호출할 수 없음. 근데 싱글톤에서는 private 생성자 사용함.
    public void out() {
        System.out.println("부모의 protected num 필드 : " + num);
        System.out.println("자식 클래스 메소드");
    }
    @Override
    public void display() {
        System.out.println("상속 받아서 재정의한 메소드");
    }
}
