package 샘플프로그램;                                         // 패키지명 : 클래스의 묶음(=folder)
/*
    Date : 2023. 08. 14
    Author : Y. R. Kim
    Purpose : 샘플 프로그램입니다.
 */

// 접근제한자이며 모두 허용
public class SampleClass {
    // 메소드에 대한 접근제한자는 public, protected, private, 아무 것도 없는 default
    public static void main(String[] args) {            // main 치고 tab, main함수는 진입 지점(여기부터 compile해라), main은 단 하나
        // static은 정적 변수. 메모리에 하나만 저장. void는 반환 값으로 아무 것도 안 넘겨줄 것이다. 넘겨줄 자료형이 있다면 void 대신~.
        System.out.println("샘플프로그램을 만들어 보자.");
//        System.out.println("지금은 실행하고 싶지 않은데 기억해야 되는 출력물이야1.");
//        System.out.println("지금은 실행하고 싶지 않은데 기억해야 되는 출력물이야2.");
    }
}
