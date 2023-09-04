package 메소드참조2;
// ToIntBiFunction<String, String> : 두 개의 문자열을 입력 받고 int 값을 리턴함.
// compareToIgnoreCase() : 두 문자열을 대소문자 구분없이 동일한 알파벳으로 구성되어 있는지 비교함.

import java.util.function.ToIntBiFunction;

public class MethodRef2 {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;
        function = (a, b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("KimYeRyeong330", "kimYeryeong330"));

        ToIntBiFunction<String, String> function2;
        function2 = String :: compareToIgnoreCase;
        print(function2.applyAsInt("kimhyeonho", "KIMHYEONHO"));
    }
    static void print(int order) {
        if (order < 0) System.out.println("사전 순이 먼저 나타난 결과입니다.");
        else if (order == 0) System.out.println("동일한 문자열입니다.");
        else System.out.println("사전 순이 나중에 나타난 결과입니다.");
    }
}
