package 커맨드라인;
// main method는 자바 프로그램의 시작 지점임.
// Command Line Interface[CLI] : (String[] args) 영역에 값을 입력하는 것.
public class CommandLineEx {
    public static void main(String[] args) {        // String[] -> 문자열 배열, args -> arguments(매개변수들)
        if(args.length != 2) {
            System.out.println("프로그램 사용법");
            System.out.println("Java Main String Argument num1 num2");
            System.exit(0);                  // 프로그램 강제 종료
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);       // 우측 상단 -> Edit Configurations -> CLI에 내가 입력할 100 300을 정수로 변환해 줌. (arguments는 공백으로 구분)
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
