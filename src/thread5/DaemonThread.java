package thread5;
// DaemonThread : 다른 Thread의 작업을 돕는 보조 Thread, daemon Thread 이외의 쓰레기가 모두 종료되면 자동

import static java.lang.Thread.sleep;

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveTh = new AutoSaveThread();
        autoSaveTh.setDaemon(true);
        autoSaveTh.start();
        sleep(30000);
    }
}
class AutoSaveThread extends Thread {       // Thread에 자동 저장 기능을 넣으려고.
    public void save() {
        System.out.println("작업 내용을 저장함.");
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            save();
        }
    }
}
