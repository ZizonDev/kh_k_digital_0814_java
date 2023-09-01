package thread2;

public class ThreadControl {
    public static void main(String[] args) {
        // sleep()
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for(int i = 0; i < 10; i++) {
//            toolkit.beep();
//            try {
//                sleep(3000);
//            } catch(InterruptedException ignored) {
//            }
//        }

        // join() : 다른 thread의 종료를 기다림.
        SumThread sumThread = new SumThread();
        sumThread.start();                                           // start : 실행 대기 상태로 (1)
//        sleep(1);                                                  // 잠깐 sumThread를 잠재우면 잠 자는 동안 운영체제가 run시킴. (3)

        try {
            sumThread.join(100);                               // join : sumThread가 끝날 때까지 main이 기다려준다.(실행 대기) (4), join() 괄호 안에는 sleep 시간을 넣어줄 수도 있다.
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());            // 1부터 100까지 증가하긴 할텐데 운영체제가 run하기까지 main이 안 기다려줌. (2)
    }
}
class SumThread extends Thread {
    private long sum;
    public long getSum() {
        return sum;
    }
    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 2100000000; i++) {
            sum += 1;
        }
    }
}