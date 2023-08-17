package 상수와리터럴;

// 상수 : 변수와 마찬가지로 메모리에 저장할 공간을 확보하는 것, 단 한 번만 값을 지정할 수 있음. 그래서 final.ㅋ
// 값을 한 번 쓰고 나면 read only 상태가 됨.
// final 키워드를 사용.

import java.util.Scanner;   // Scanner 사용하기 위해 import 해야 함. java.util이 라이브러리 모음집.

public class ConstantClass {

    final static String KH_DOMAIN = "http://192.167.12.13";         // static은 main 안에 들어갈 수 없음. 상수는 값이 복제되면 안되기 때문에 final 뒤에 static 붙은 것.
    final static String PORT_NUM = "8111";
    public static void main(String[] args) {        // 변수 선언은 반드시 method 안에서.
        final int AGE;   // 상수는 관례상 대문자 사용. (할당을 먼저 안하고 뒤에 해도 됨. 즉 9행의 30 없어도 오류 안 남.) 자바는 선언과 별도로 단 한 번 값의 대입이 가능.
        char gender = 'M';

        if(gender == 'M') {
            AGE = 33;
//            System.out.println(AGE);
        }
        System.out.println(AGE);

        final double TAX_RATE = 0.10;       // 세율 값을 고정함.
//        Scanner sc = new Scanner(System.in);         // 표준 입력을 받기 위해 사용함.
//        System.out.print("수입을 입력 하세요 : ");      // println은 줄바꿈 포함, print는 줄바꿈 없음.
//        int income = sc.nextInt();                   // 키보드로부터 입력 받은 값을 정수형 변수에 대입함.
//        System.out.println("당신이 내야 할 세금은 " + (income * TAX_RATE) + "원 입니다.");

        System.out.println(KH_DOMAIN);
        System.out.println(PORT_NUM);


    }
}
