package object클래스2;
// clone() 메소드는 Cloneable 인터페이스를 구현한 클래스의 instance만 사용할 수 있음.
public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean adult;

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();              // clone()은 Object 클래스 타입임. Member형으로 변환해 줘야 함.
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();                    // 3행의 implements Cloneable이 없으면 error가 어떤 게 발생했는지 출력해줌.
        }
        return cloned;
    }
    void viewInfo() {
        System.out.println("I    D : " + id);
        System.out.println("이   름 : " + name);
        System.out.println("비밀번호 : " + password);
        System.out.println("나   이 : " + age);
    }
}
