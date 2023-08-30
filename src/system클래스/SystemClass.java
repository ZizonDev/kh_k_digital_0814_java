package system클래스;

import static java.lang.Thread.sleep;

public class SystemClass {
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        long nanoTime = System.nanoTime();
        System.out.println(time);                   // (Milli second 단위)1693356146287 출력됨.
        System.out.println(nanoTime);               // (Nano second 단위)1213539556718700 출력.

        // 프로그램 수행 시간 측정하기.
        int[] data = new int[10000];
        int cnt = 0, i;
        int randVal = (int)(Math.random() * 10000) + 1;
        for(i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        long startTime = System.currentTimeMillis();            // for문 수행 시작 시간.
        for(i = 0; i < data.length; i++) {
            cnt++;                                              // 몇 번 만에 찾았는지 구하는 것.
            sleep(1);                                      // 1 / 1000 초 동안 잠깐 잠 재우기.
            if(randVal == data[i]) {
                System.out.println("위치 : " + (i + 1));
                break;
            }
        }
        long endTime = System.currentTimeMillis();              // 위의 for문을 수행하는 데 걸린 시간. 종료 시간.
        System.out.println("총 검색 횟수 : " + cnt);              // 총 검색 횟수는 사실 찾고자 하는 i의 위치와 동일함.
        System.out.println("총 소요 시간 : " + (endTime - startTime) + " milli second 입니다.");

        // 시스템 정보 불러오기.
        System.out.println(System.getProperty("os.name"));      // Window 10 출력됨.
        System.out.println(System.getProperty("user.name"));    // user1 출력됨.
        System.out.println(System.getProperty("os.home"));      // null.
    }
}
