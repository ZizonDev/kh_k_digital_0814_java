package 연산자;
// 산술 연산자 : 사칙연산(+, -, *, /)과, 나머지 연산(%)

import java.util.Scanner;

public class OperatorClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
        System.out.println("덧셈 : " + (num1 + num2));
        System.out.println("뺄셈 : " + (num1 - num2));
        System.out.println("곱셈 : " + (num1 * num2));
        System.out.println("나눗셈 : " + ((double)num1 / num2));
        System.out.println("나머지 : " + (num1 % num2));           // 알고리즘 문제 풀 때 자주 씀!!!
        System.out.println("몫 : " + ((int)num1 / num2));         // num1, num2가 int형으로 선언되어서 소수점 이하 날리니까 필요없긴한데.

        // /0.0 -> Infinity
        // %0.0 -> NaN (Not a Number)

// 대입 연산자 : 변수에 값을 대입하는 연산자( = ), 프로그램에서 = 같다라는 의미가 아니라 대입한다는 의미!!! (같다라는 연산자는 ==)
// 복합 대입 연산자
        System.out.println(num1 += 2);          // == [num1 = num1 + 2 = 12], num1 값이 초기화되어 있지 않으면 error.
        System.out.println(num1 -= 2);          // == [num1 = num1 - 2 = 10], 위의 식에서 num1이 12가 되었음에 주의!!!
        System.out.println(num1 *= 2);          // == [num1 = num1 * 2 = 20]
        System.out.println(num1 /= 2);          // == [num1 = num1 / 2 = 10]

// 증감 연산자 : 단항 연산자, 피연산자의 값을 1증가 or 1감소시키는 연산자.
        System.out.println(++num1);             // 11, 1을 먼저 대입하고 나서 증가시킨다.
        System.out.println(num1++);             // 11, num1일단 찍고 나중에 1 증가시킨다. (만약 25행이 24행으로 가게되면 결과는 10)

        int tmp = num1++;
        System.out.println(tmp);
        System.out.println(num1);

        System.out.println(num1--);             // 13, 바로 위의 식에서 num1이 13이 되었음.
        System.out.println(--num1);             // 12

// 비교 연산자 : 두 개의 피연산자를 비교하여 어느 쪽이 큰 지를 판단. 결과는 참 or 거짓으로 나옴. not 1 or 0.
        int x = 10;
        int y = 20;
        System.out.println(x > y);                // false (not 0 !!!)
        System.out.println(x < y);                // true  (not 1 !!!)
        System.out.println(x == y);               // false
        System.out.println(x != y);               // true
        System.out.println(x >= y);               // false
        System.out.println(x <= y);               // true

// 논리 연산자 : &&(AND 연산자 : 둘 다 true이면 true), ||(OR 연산자 : 둘 중 하나 이상이 true이면 true)
// 부정 연산자 : !(NOT 연산자 : 현재가 true이면 false, false이면 true)
// &&의 경우 앞이 거짓이면 뒤는 아예 수행을 안 한다.
        boolean rst1, rst2, rst3;
        rst1 = (x > 0) && (x > y);                // false
        rst2 = (x > 0) || (x > y);                // true
        rst3 = !((x > 0) || (x < y));             // false
        System.out.println(rst1 + "" + rst2 + "" + rst3);

// 삼항 연산자 : 3개의 피연산자를 필요로 함, 조건문이랑 비슷.
        Scanner sc = new Scanner(System.in);      // 키보드 입력을 받기 위함. import java.util.Scanner; 필요!!!
        System.out.println("==== 성인인지 확인하기 ====");
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;
        System.out.println(isAdult);

// 문자열 결합 연산자
        System.out.println("Java" + 18.04 + 12);        // Java18.0412
        System.out.println(3.3 + 3 + "JDK");            // 6.3JDK

// 연산자의 우선 순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;
        result1 = val1 + val2 * val3;       // 30
        result2 = (val1 + val2) * val3;     // 50
        result3 = val1 + (++val2) * val3;   // 35
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
