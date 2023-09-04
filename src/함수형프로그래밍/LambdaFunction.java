package 함수형프로그래밍;
// 함수형 프로그래밍 :  자바 8에서 도입, 자료 처리를 수학적 함수의 계산으로 취급하고 상태와 가변 데이터를 멀리하는 프로그래밍 패러다임.

interface Calculator {                  // 객체 지향 코드 사용 : sum이라는 메소드를 만들고 이를 상속받은 새로운 클래스에서 오버라이딩을 해줬어야 함.
    int sum(int a, int b);
}
//class MyCalculator implements Calculator {
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }

public class LambdaFunction {
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
//        int result = mc.sum(10, 20);
        Calculator calc = (int a, int b) -> a + b;      // 람다식으로 변형함!! 인터페이스 상속을 받아 클래스 대신 람다식을 사용.
        int result = calc.sum(10, 20);            // Calculator의 인터페이스에서 새로운 객체를 생성하고 이를 바로 main에서 매개변수로 쓸 수 있다.
        System.out.println(result);
    }
}
