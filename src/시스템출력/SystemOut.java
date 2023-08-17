package 시스템출력;

import java.util.Scanner;               //Scanner 쓸 때 무조건 import 해줘야.

// System.out : 표준 출력 스트림
// print, println : 오버로딩이 적용된 메소드이며 줄바꿈 차이만 있음. [오버로딩 : 키워드는 동일하지만 여러 자료형을 다룰 수 있는.. 예를들어  println(int x) =! println(char x)]
public class SystemOut {
    public static void main(String[] args) {
//        String name = "곰돌이사육사";
//        String addr = "수원시";
//        int age = 22;
//        double pi = 3.14159265358979323846;
//
//        System.out.println(age);          // 여기서는 int형 println이 쓰임.
//        System.out.println(name);         // 여기서는 String형 println이 쓰임. [오버로딩]
//        System.out.printf("%s\n", name);    // printf는 오버로딩이 없으므로 서식이 추가되어야 함. %가 서식을 의미함.
//        System.out.printf("%.2f\n", pi);

        String name = "곰돌이 사육사";
        String addr = "수원시";
        int age = 22;
        char gender = 'M';
        int kor = 99, eng = 88, mat = 40;

        // 자바 스타일 : 오버로딩으로 구현되어 있음.
        System.out.println("======= Java Style =======");     // println의 n은 new line 생성 (println == print + ~\n)
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + kor + eng + mat);      // 앞에 총점이라는 문자열이 와서, 99, 88, 40을 문자형으로 묵시적 형 변환한 경우. 걍 이어붙이기된 거임.
        System.out.println("총점 : " + (kor + eng + mat));    // 괄호로 묶어주게 되면 연산자 우선 순위를 변경하여 괄호 안 덧셈을 먼저 계산.
        System.out.println("평균 : " + ((double)(kor + eng + mat) / 3));      // 연산자 우선 순위가 덧셈보다 나눗셈이 높아서 괄호를 사용하여 순서를 변경해야 함. (3대신 3.0도 됨)

        // C언어 스타일 : 서식을 지정하는 스타일.
        // 서식 지정자 : %d(decimal, 정수), %ld(long type decimal), %u(un, 부호 없는 정수형), %s(string), %f(float, 실수형), %c(character, 문자)
        // 이스케이프 시퀀스 : \n (new line, 줄 바꿈), \r(carriage return, 커서를 라인의 처음으로 이동), \t(tab, 들여쓰기), \b(backspace)
        System.out.printf("이름 : %s\n", name);
        System.out.printf("오늘의 습도는 %.2f%% 입니다.", 85.555555); // %.2f는 실수값을 소수점 이하 두 자리까지 반올림하여 표현해주는 서식.
        System.out.printf("성별 : %c\n", gender);                  // 문자형 출력. (not 문자열)
        System.out.println("안녕하세요. \\ 저의 이름은 \"곰돌이사육사\" 입니다.");    // \"는 진짜 큰 따옴표를 쓰기 위함.
        System.out.printf("평균 : %.2f\n", (kor + eng + mat) / 3.0);

        System.out.println("Apple\rBanana\t Orange\b\b\n");             // \r은 커서가 제일 앞으로 가서 Apple이 사라짐.
        System.out.printf("|%-6d|%-6d|%-6d|\n", 100, 2000, 30000);      // -6만큼 왼쪽으로 정렬, +하면 오른쪽으로 정렬.

// 변경사항 테스트

        Scanner sc = new Scanner(System.in);                    // sc라는 새로운 객체에 입력값(in)을 받겠다.
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();                                   // 이거는 콘솔창에 n을 직접 입력할 수 있는 거.
        for(int i = 1; i <= n*n; i++) {                         // i는 1로 초기화; i는 n^2보다 작거나 같다는 조건; i는 증가함, i를 중괄호 안에도 포함시키기 위해 노 세미콜론.
            System.out.printf("%4d", i);                        // 각 숫자를 4칸 오른쪽으로 정렬.
            if(i % n == 0) System.out.println();                // n의 배수가 될 때마다 줄을 바꿔라.
        }


// 집가서 확인해 볼 변경점


    }
}
