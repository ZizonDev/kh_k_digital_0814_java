package thread1;
// Thread : 하나의 프로그램 안에서 여러 일을 동시에 수행하는 것. (멀티 태스킹은 여러개의 프로그램이 동시에 돌아가는 것.)

public class ThreadNameEx {
    public static void main(String[] args) {
        Thread testThread = new CustomThread();
        testThread.start();     // run 대신 start를 쓴 이유 : start 자체가 Thread를 동작시키는 것은 아님. just 운영체제에게 Thread 동작해줄 것을 요청.
        System.out.println("Main에서 찍어봅니다.");

        Runnable runThread1 = new InterThread();     // 실제 작업 내용을 갖고 있음. but Thread 객체는 아님.
        Thread runThread2 = new Thread(runThread1);
        runThread2.start();
    }
}

// 방법 1. 상속을 받아서 Thread를 생성.
class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속받은 쓰레드 :" + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

// 방법 2.
class InterThread implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
