package 생성자오버로딩;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsepower;

    public void carInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsepower);
    }
}
