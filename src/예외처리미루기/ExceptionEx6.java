package 예외처리미루기;

import java.io.IOException;

public class ExceptionEx6 {
    public static void main(String[] args) {                 // 만약 main에서 throws 하면 던지기고, 하위 클래스에서 throws하면 미루기.
        IOSample test = new IOSample();
        try {
            test.input();
            test.output();
        } catch (IOException e) {
            System.out.println("입력이 잘못되었습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {        // 입력받은 문자열이 지나치게 긴 경우 범위를 초과하여 에러가 뜰 수 있다.
            e.printStackTrace();
        }

    }
}

class IOSample {
    private int num;
    public void input() throws IOException {    // main에서 던지지않고 input에서 main쪽으로 던져서 예외처리를 미룸.
        num = System.in.read();                 // System.in.read 단순히 문자를 받는 친구, 예외처리가 필요함. 혹은 throw.
    }
    public void output() {
        System.out.println(num);
    }
}