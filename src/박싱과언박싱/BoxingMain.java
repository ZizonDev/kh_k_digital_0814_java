package 박싱과언박싱;

public class BoxingMain {
    public static void main(String[] args) {
        Integer num1 = 12;                   // Auto Boxing. int num을 Interger안으로 boxing.
        Integer num2 = new Integer(12);           // 원래는 이렇게 수동으로 박싱해 줘야 함.
        System.out.println(num1);
        System.out.println(num2);

        Character ch1 = 'X';                              // Auto Boxing.
        char ch2 = ch1;                                   // Auto Unboxing.
        System.out.println(ch2);                          // X가 출력됨.
    }
}
