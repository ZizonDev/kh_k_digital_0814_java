package 다중인터페이스;
// 자바는 다중 상속을 지원하지 않음(because of 다이아몬드 상속), 그 대신 인터페이스를 통해 다중 상속의 효과를 만들어 냄.

public class MultiInterface {
    public static void main(String[] args) {
        SportsCar ferrari = new SportsCar(true, 20, false, 200, "Red", "2023", false);
        ferrari.viewInfo();
    }
}
