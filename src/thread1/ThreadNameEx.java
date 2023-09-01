package thread1;
// Thread : 하나의 프로그램 안에서 여러 일을 동시에 수행하는 것. (멀티 태스킹은 여러개의 프로그램이 동시에 돌아가는 것.)

// 이 예제에서는 thread가 4개가 각각 돌고있는 것임. Main Thread, 상속 Thread, 인터페이스 Thread, 람다식 Thread.
public class ThreadNameEx {
    public static void main(String[] args) {
        // 방법 1. Thread 클래스를 상속 받아서 thread 생성.
        Thread testThread = new CustomThread();
        testThread.start();     // run 대신 start를 쓴 이유 : start 자체가 Thread를 동작시키는 것은 아님. just 운영체제에게 Thread 동작해줄 것을 요청.
        testThread.setName("Customed Thread");

        // 방법 2. Runnable 인터페이스로부터 thread 생성.
        Runnable runTask = new InterThread();     // 실제 작업 내용을 갖고 있음. but Thread 객체는 아님.
        Thread runThread1 = new Thread(runTask);
        Thread runThread2 = new Thread(runTask);
        runThread1.start();
        runThread2.start();
        runThread1.setName("Runnable1 Thread");
        runThread2.setName("Runnable2 Thread");

        // 방법 3. 익명의 객체 Runnable로부터 thread 생성. (주로 사용하는 방법.)
        Runnable task = new Runnable() {        // Runnable은 이미 interface 였기 때문에 구현부가 필수인 익명 객체 생성 가능.
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("익명의 객체 :" + sum);
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);
            }
        };                                      // ; 잊지말기
        Thread anonymousThread = new Thread(task);
        anonymousThread.start();
        anonymousThread.setName("Anonymous Thread");

        // 방법 4. 람다식으로 익명의 객체를 만들고 thread 생성. (생략 가능한 건 다 생략하겠다.)
        Runnable task2 = () -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println("람다식 객체 :" + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);
        };
        Thread lambdaThread = new Thread(task2);
        lambdaThread.start();
        lambdaThread.setName("Lambda Thread");
    }
}


// 방법 1. By Customed Class Thread
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

// 방법 2. By Runnable Interface
class InterThread implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스 :" + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
