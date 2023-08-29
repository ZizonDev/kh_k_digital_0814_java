package math클래스;
// Math Class : 수학에서 자주 사용하는 상수, 함수를 미리 구현해 놓은 클래스.
// Math 클래스의 모든 메소드는 static이므로 객체 생성할 필요 없이 바로 사용한다.
// java.lang 패키지에 포함되어 있어서 import 필요 없다.

public class MathClass {
    public static void main(String[] args) {
        // Math.random() : 0 < x < 1 인 임의의 double형 x를 반환함.
        System.out.println((int)(Math.random() * 100));     // 0 < x < 100

        // ceil() : 소수점 이하는 무조건 올림.
        System.out.println(Math.ceil(10.11));               // 11.0
        System.out.println(Math.ceil(10.1));                // 11.0

        // floor() : 소수점 이하는 무조건 내림.
        System.out.println(Math.floor(22.98));              // 22.0
        System.out.println(Math.floor(21.9999));            // 21.0

        // round() : 소수점 첫째 자리에서 반올림.
        System.out.println(Math.round(25.55));              // 26
        System.out.println(Math.round(25.44));              // 25

        // max(), min() : 둘 중 최댓값 출력, 최솟값 출력.
        System.out.println(Math.max(100, 0));               // 100
        System.out.println(Math.min(100, 0));               // 0
    }
}
