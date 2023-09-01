package thread4;
// Thread 종료 : stop() <- 기존에 있던 method였으나, 현재는 사용 중지됨. => 대신 interrupt()

import static java.lang.Thread.sleep;

public class ThreadStop {
    public static void main(String[] args) throws InterruptedException {
        // 방법 1.
        RunThread runThread = new RunThread();
        runThread.start();
        sleep(2000);
        runThread.setStop(true);

        // 방법 2.
        RunThread1 runThread1 = new RunThread1();
        runThread1.start();
        try {
            sleep(3000);
        } catch(InterruptedException e) {}
        runThread1.interrupt();
    }
}

// 방법 1.
class RunThread extends Thread {
    private boolean stop;       // stop flag 설정.
    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run() {
        while (!stop) {         // 예를 들어 비상 상황이 아니면 계속 돌고 있는 엘리베이터.
            System.out.println("Thread 실행 중...");
        }
        System.out.println("자원 정리 중...");
        System.out.println("실행 종료");
    }
}

// 방법 2.
class RunThread1 extends Thread {
    private boolean stop;
    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run() {
        try{
            while (true) {         // 예를 들어 비상 상황이 아니면 계속 돌고 있는 엘리베이터.
                System.out.println("Thread 실행 중...");
                sleep(1);    // 이게 무조건 있어야 interruptedException을 발생시킬 수 있다.
            }
        } catch(InterruptedException e) {
            System.out.println("interupt 발생!!!!!!");
        }
        System.out.println("자원 정리 중...");
        System.out.println("실행 종료");
    }
}