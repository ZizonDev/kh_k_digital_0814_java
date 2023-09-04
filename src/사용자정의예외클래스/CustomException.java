package 사용자정의예외클래스;
// java는 수많은 예외 클래스를 기본적으로 갖고 있음. 그러나 사용하려는 목적에 맞는 예외 처리가 없는 경우 직접 예외 클래스를 만들 수 있다.

public class CustomException {
    public static void main(String[] args) {
        CheckEven ce = new CheckEven();
        int num1 = 100;
        int num2 = 99;
        try {
            System.out.println(ce.printEven(num1));         // 100을 printEven에 넣어서 짝수인지 아닌지 출력하는 걸 try
            System.out.println(ce.printEven(num2));
        } catch (EvenException e) {                         // 짝수가 아닌 경우 예외를 발생시켜서 error message로 짝수가 아니라고 출력된다.
            e.printStackTrace();
        }

    }
}
class EvenException extends Exception {
    private Integer number = null;
    public EvenException(int number) {
        this.number = number;
    }
    @Override
    public String getMessage() {
        if(number == null) return "숫자가 아닙니다.";
        else return number + "는 짝수가 아닙니다.";
    }
}
class CheckEven {
    private int num;
    public void setNum(int num) {
        this.num = num;
    }
    public int printEven(int number) throws EvenException {
        this.num = number;
        if (number % 2 != 0) throw new EvenException(num);
        else return num;
    }
}