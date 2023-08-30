package class클래스;

import java.util.Scanner;

public class ClassClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("설정할 이름을 입력하세요 : ");
        String st = sc.nextLine();
        String s = st;
        Class c = s.getClass();         // 스트링에 클래스 이름을 넣은 것임.
        System.out.println(c);
    }
}
