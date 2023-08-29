package object클래스1;
public class ObjectClass {
    public static void main(String[] args) {
        // toString() : 해당 instance의 정보를 문자열로 반환.
        // toString()의 반환 형식 [클래스이름@해시코드] : 객체의 메모리 주소를 이용하여 해시코드 생성.
        // 객체의 메모리 주소값이 힙 영역에 있을 것. 이 주소값을 Hash Function에 입력하여 고유값인 Hash Code 출력.
        // Hash Code의 이용 : Hash Code는 고유값이므로 위,변조 방지 목적으로 주로 사용함. 주소값이라는 건 아무도 알 수 없기 때문에 역추적 불가능.
        // toString() 메소드는 오버라이딩해서 사용 가능하고, String과 Integer의 경우 이미 오버라이딩 되어 있음.
        Car car01 = new Car();
        Car car02 = new Car();
        System.out.println(car01.toString());           // Object클래스.Car@6a5fc7f7 (힙 영역의 주소값을 해시코드로 만듦.)
        System.out.println(car02.toString());           // Object클래스.Car@3b6eb2ec (car01과 car02는 서로 다른 객체임.)
        String test1 = "김예령";
        Integer test2 = 2023;                           // String과 Integer는 이미 주소값에서 문자열, 정수값으로 오버라이딩 된 case.
        System.out.println(test1.toString());           // 이 경우 해시코드가 반환되지 않고 "김예령"이 반환됨. (== println(test1);)
        System.out.println(test2.toString());           // 마찬가지로 "2023" 반환. ( == System.out.println(test2); )

        // equals() : instance (car01) 를 매개변수로 전달받는 참조변수 (car02) 와 비교하여 주소값이 동일한지 여부를 반환함.
        System.out.println(car01.equals(car02));        // false 반환됨.
        Car car03 = car01;
        System.out.println(car01.equals(car03));        // true 반환됨.
    }
}
class Car {
}