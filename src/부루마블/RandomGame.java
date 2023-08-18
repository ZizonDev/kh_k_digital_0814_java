package 부루마블;
// 두 개의 주사위를 던져 12가 나오면 탈출하는 게임.

public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;              // 몇 번만에 탈출했는지를 counting.
        while(true) {
            cnt++;                // while문 안에서 가장 처음으로 카운트 시작. 횟수 증가하니깐.
            rand1 = (int) ((Math.random() * 6) + 1);        // Math.random()을 하면 0.000001부터 0.999999 사이의 실수값이 나옴. -> (0.000006 ~ 5.4xxxxx) -> (1.000006 ~ 6.4xxxxx)
            rand2 = (int) ((Math.random() * 6) + 1);        // 정수 1부터 6까지를 무작위로 추출하기 위함.
            if((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d번 만에 탈출했습니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }
        }
    }
}
