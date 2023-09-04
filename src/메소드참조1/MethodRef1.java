package 메소드참조1;
// 메소드 참조 : 메소드를 참조하여 매개 변수의 정보 및 리턴 타입을 알아냄. 그리고 불필요한 매개 변수를 제거하는 것이 목적.

import java.util.function.IntBinaryOperator;

class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }
    public int instanceMethod(int x, int y) {
        return x + y;
    }
}

public class MethodRef1 {
    public static void main(String[] args) {
        IntBinaryOperator operator;         // IntBinaryOperator : 두 개의 정수값을 받아 연산을 수행한 결과를 반환하는 메소드를 정의하기 위해 사용.
        operator =  (x, y) -> Calculator.staticMethod(x, y);                     // 정적 메소드 참조 by Lambda Function.
        System.out.println("결과 1 : " + operator.applyAsInt(10, 20));
        operator = Calculator :: staticMethod;                                   // REAL 정적 메소드 참조. operator에 계산기 클래스 :: 연산할 메소드.
        System.out.println("결과 2 : " + operator.applyAsInt(30, 40));
        Calculator object = new Calculator();
        operator = object :: instanceMethod;
        System.out.println("결과 3 : " + operator.applyAsInt(50, 60));
    }
}
