package 추상클래스1;
// 추상클래스는 클래스명 앞에 명시적으로 abstract를 붙여서 만듦.
// 추상클래스는 객체를 생성할 수 없다.
// 내부에 0개 이상의 추상메소드가 포함되어 있음. (추상메소드가 없어도 추상클래스가 될 수 있다.)
// 추상메소드는 상속 받는 클래스에서 반드시 오버라이딩해야 함. (자식 클래스에서 부모 메소드를 구체화시킴.)
// 추상 클래스는 자동차 내부의 에어컨을 생각하면 쉬움.
// 자동차 내부 에어컨이 고장났을 때 자동차 자체를 분해할 수 없으니까 자동차와 내부 에어컨은 느슨한 결합으로!!!
// 느슨한 결합 관계로 상속할 때 부모클래스에서 추상메소드를 사용함.


public abstract class AnimalClass {        // 추상 클래스임. 추상 메소드와 일반 메소드가 동시에 존재하는 추상 클래스.
    abstract void cry();                   // <- {} 부분이 body 역할인데 추상메소드이므로 {}라는 실체가 없어야 함.
                                           // 추상 메소드는 상속받은 자식클래스에서 구체화를 해줘야 함.(오버라이딩)
    void sleep() {
        System.out.println("zzzzzz");      // 추상 메소드가 아니니까 오버라이딩 해도 되고 안해도 됨.
    }
}
class Cat extends AnimalClass {
    @Override
    void cry() {                          // {}라는 body, 구현부를 오버라이딩함. -> 실체가 구체화된 것임.
        System.out.println("야옹!!!");
    }
    @Override
    void sleep() {
        System.out.println("Zzz... Zzz...");
    }
}
class Dog extends AnimalClass {
    @Override
    void cry() {
        System.out.println("멍멍!!!");
    }
}
