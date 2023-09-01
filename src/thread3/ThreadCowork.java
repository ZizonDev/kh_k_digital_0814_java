package thread3;
// Thread 간의 협업 : wait(), notify(), notifyAll()
// notify() : 일시 정지 상태에 있는 thread를 실행 대기 상태로 바꾸어 줌.
// wait() : 자기 자신을 일시 정지 상태로 만듦.

public class ThreadCowork {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();     // 객체 생성
        Thread threadA = new ThreadA(sharedObject);     // 객체 주입
        Thread threadB = new ThreadB(sharedObject);     // threadA와 threadB는 같은 객체의 동일한 주소를 받았음.
        threadA.start();
        threadB.start();
    }
}
class WorkObject {
    // synchronized : Multi-Thread 환경에서 임계 영역에 접근하는 것을 방지하는 역할. (Lock / Unlock 제공)
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify();           // 일시 정지 상태의 threadB를 실행 대기 상태로 만듦.
        try {
            wait();         // lock인 채로 들어온 methodA가 자는 동안 threadB는 일함. 완벽히 교차하며 진행.
        } catch(InterruptedException e) {}
    }
    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify();           // 일시 정지 상태의 threadA를 실행 대기 상태로 만듦.
        try {
            wait();
        } catch(InterruptedException e) {}
    }
}
class ThreadA extends Thread {
    final private WorkObject workObject;
    public ThreadA(WorkObject workObject) {         // 반대편에서 new로 호출해줄거니까 new WorkObjedt 필요 없음.
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();                   // 주입할 객체 wordObject를 여기서 오버라이딩 해 준 것임. (for 의존성 주입)
        }
    }
}
class ThreadB extends Thread {
    final private WorkObject workObject;
    public ThreadB(WorkObject workObject) {         // 반대편에서 new로 호출해줄거니까 new WorkObjedt 필요 없음.
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodB();                   // 주입할 객체 wordObject를 여기서 오버라이딩 해 준 것임. (의존성 주입)
        }
    }
}