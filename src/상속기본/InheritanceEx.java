package 상속기본;
// 상속 : 자식 클래스가 부모 클래스의 기능을 물려받는 것. (필드와 메소드를 물려받음.)
// 키워드로 extends 사용.

public class InheritanceEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("golden retriever");               // Animal 클래스로부터 setName 기능을 상속받았음.
        dog.sleep();                                   // Animal 클래스에 없던 sleep 기능을 추가. [overriding]

        HouseDog houseDog = new HouseDog();
        houseDog.setName("border collie");
        houseDog.sleep(10);                             // 기존의 sleep 기능을 재정의한 기능이 적용됨. [overriding이 우선.]
    }
}
