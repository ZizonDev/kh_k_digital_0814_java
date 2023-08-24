package this변수와메소드;

public class Car {
    private String model;       // 자동차명
    private int year;           // 출고년도
    private String color;       // 색상
    private int maxSpeed;       // 최고속도

    Car() {}                                                     // 매개변수가 없는 타입 생성.
    Car(String model) {                                          // 매개변수 1개만 받았음.
        this(model, 2022, "black", 230);        // 매개변수로 받은 model은 그대로 두고 나머지 객체들의 값을 바로 넣어줌. Car라는 생성자에서 다른 생성자들을 참조하는 this().
    }
    Car(String model, int year, String color, int speed) {       // 지역변수가 우선순위가 높음.
        this.model = model;                                      // 위에서 인스턴스 필드에서 선언한 객체 model을 Car의 지역변수로 쓰겠다. 자기 자신의 객체를 참조하는 변수 this.
        this.year = year;
        this.color = color;
        maxSpeed = speed;                                        // 매개변수 speed와 인스턴스 필드에 있던 maxSpeed의 이름이 구분되므로 this 안 써도 됨.
    }
}
