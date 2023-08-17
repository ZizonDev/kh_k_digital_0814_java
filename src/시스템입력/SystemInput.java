package 시스템입력;
// Scanner 클래스를 사용해서 입력 받음

import java.util.Scanner;                           //Scanner 쓰려면 import 무조건 해줘야 됨. Scanner는 기본 라이브러리에 없기 때문.

public class SystemInput {
    public static void main(String[] args) {
//        // 클래스는 설계 도면(blue print)이라고 생각하면 된다.
//        // new는 동적 메모리 공간에 sc라는 객체를 만들어주는 명령어. [동적 할당 =! 정적 할당]
//        Scanner sc = new Scanner(System.in);    // Scanner 클래스에 대한 객체 sc 생성.
//        byte a = sc.nextByte();                 // byte형 입력을 받아서 반환. 이 때 a의 범위는 ~128 <= a <= 127.
//        short b = sc.nextShort();               // short형의 입력을 받아 반환.
//        int c = sc.nextInt();                   // int형.
//        long d = sc.nextLong();                 // long형.
//
//        char ch = sc.next().charAt(0);          // sc.next()는 공백 기준으로 문자열까지 받을 수 있는. charAt(0)은 인덱스 0의(맨 앞) 문자 하나를 추출하여 ch에 대입.
//
//        float e = sc.nextFloat();               // float형 입력을 받아서 반환.
//        double f = sc.nextDouble();             // double형.
//
//        String g = sc.next();                   // 공백 기준으로 입력 받음. 즉, 공백이 들어오게 되면 입력이 끝났다고 생각하고 넘어가는 것.
//        String h = sc.nextLine();               // 줄바꿈 문자 기준. 즉, 줄바꿈이 들어오게 되면 입력이 끝났다고 생각하고 넘어가는 것.

        Scanner sc2 = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc2.next();               // 이름 입력받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어감.
        sc2.nextLine();                          // 버퍼 비우기. 기존에 만들었던 이름입력하세요인 곰돌이사육사가 뜨기 때문.
        System.out.print("주소를 입력하세요 : ");
        String addr = sc2.nextLine();           // 주소 입력받은 후 줄바꿈이 일어나면 다음으로 넘어감.

        System.out.print("성별을 입력하세요 : ");
        char gender = sc2.next().charAt(0);     // 입력받은 문자열에서 맨앞의 문자 한 자 추출함.
        System.out.print("나이를 입력하세요 : ");
        int age = sc2.nextInt();                // 나이는 정수값.
        System.out.println("");                 // 공백 넣어봤음ㅋ.

        System.out.println("==== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("======================");
    }

}
