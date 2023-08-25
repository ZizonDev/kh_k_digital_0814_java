package 추상클래스1;

public class AnimalMain {
    public static void main(String[] args) {
//        AnimalClass animalClass = new AnimalClass() {         // 익명의 클래스를 생성한 것임. 객체를 선언할 수 없음.
//            @Override                                         // java에서 자동으로 일회성 구현부를 만들어준 것일 뿐임.
//            void cry() {
//
//            }
        Cat cat = new Cat();
        cat.cry();
        cat.sleep();

        Dog dog = new Dog();
        dog.cry();
        dog.sleep();                                // Dog 클래스는 부모클래스를 오버라이딩하지 않았기 때문에 이전의 zzzzzz가 출력.

        AnimalClass animal = new Cat();             // 부모클래스 소속 객체가 실체가 있는 자식 클래스 Cat을 바라볼 수 있다. (자주 사용함!)
        animal.sleep();
    }
}
