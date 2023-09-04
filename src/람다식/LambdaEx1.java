package 람다식;

@FunctionalInterface            // 함수형 프로그램임을 명시적으로 나타내기 위한 Annotation.
interface MyFuncInterface {     // 이 인터페이스는 method 하나만을 위한 인터페이스임. void method2를 추가하게 되면 모호성 발생. 에러.
    void method(int x);         // 자바 특성 상 method가 독립적으로 존재할 수 없어서 불가피하게 interface로 감싸줘야 한다.
}

@FunctionalInterface            // 리턴 값이 있는 람다식.
interface MyFuncinterface2 {
    int min(int x, int y);
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> {     // 매개변수가 하나인 경우 소괄호 생략 가능. just x.
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(5);

        MyFuncinterface2 fi2 = (x, y) -> (x < y) ? x : y;       // 구현부가 한 줄인 경우 중괄호 생략 가능. & return도 생략 가능.
        System.out.println(fi2.min(100, 5));
    }
}

