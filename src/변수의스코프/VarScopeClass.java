package 변수의스코프;

import java.sql.SQLOutput;

// 변수가 할당되고 사용되는 범위 확인
public class VarScopeClass {
    public static void main(String[] args) {
//        int value = 10;         // int형으로 선언된 변수 value에 10을 할당함.
//        int sum = value + 20;   // int형으로 선언된 변수 sum에 (value 값 + 20)을 할당함.
//        System.out.println("sum의 값 : " + sum);
//        int n = 20;               // 여기서 선언된 n은 아래의 에러 식까지 적용됨. 중괄호 바깥에 있기 때문.
//        if (n > 10) {             // n은 블록 스코프. 중괄호가 끝나면 n의 범위는 사라짐.
//            int m = 30;           // n이 먼저 주어졌으므로 m의 초기값은 적용되지 않음.
//            m = n - 10;
//            System.out.println("m 값 : " + m);
//        }
//        int k = n + m;            // m의 초기값이 선언되지 않았음.
//    }
//
//        byte num1 = 127;            // 128을 대입하게 되면 오류 뜸. (-128 <= Byte <= 127)
//        num1++;                     // 127이 128이 되는데 요거는 intellij에서 오류 못 잡음.
//
//        System.out.println(num1);   // -128이 출력됨. 127에서 1이 증가하면서 맨앞의 부호자리를 건드리게 됨. [overflow]

        // 문자 자료형 : 자바에서는 유니코드 사용. (2 byte로 전세계의 모든 문자를 표시.) 앞의 1Byte는 ASCII와 동일.
//        char ch = 'A';      // 자바에서 문자는 작은 따옴표. 문자열은 큰 따옴표. 문자의 경우 실제 저장은 정수값으로 저장됨. (A = 65)
//        String ch1 = "A";   // 문자열은 큰 따옴표. (파이썬, 자바스크립트에서는 큰 따옴표/작은 따옴표 구분 없음.)
//
//        System.out.println(ch);
//        System.out.println((int)ch);    // 명시적으로 형을 int형으로 변경함.}
//
//        char ch2 = 66;                  // char형은 음수가 올 수 없음.
//        System.out.println(ch2);
//        System.out.println((int)ch2);

        // 실수 자료형 : float(4Byte, 32bit), double(8Byte, 64bit), 근사치 계산법, 실수 계산보다는 정수 계산이 용이.
//        float height = 175.5f;
//        double pie = 3.14159265;

        double num1 = 0.1;
        for (int i = 0; i < 1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);         // 변수 num1 실수값이고 java에서는 근사치 계산을 한다는 한계. [부동 소수점 오류]
    }
}