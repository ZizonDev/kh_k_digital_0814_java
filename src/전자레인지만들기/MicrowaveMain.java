package 전자레인지만들기;
/*
    [문제]
    3개의 시간조절용 버튼 A,B,C가 달린 전자레인지.
    버튼을 누를 때마다 각각 5분, 1분, 10초씩 더해진다.
    전자레인지로 요리해야 할 시간 T가 초단위로 표시됨.
    A,B,C를 적절히 조합해 정확히 T초가 되도록 한다. -> 최소버튼 조작
    if T=100 -> B = 1, C = 4가 최소횟수임. C = 10은 최소버튼 조작이 아님.
    T=234와 같이 3개의 버튼으로 정확히 맞출 수 없는 경우도 존재.

    [입력]
    첫 번째 줄에 요리시간 T초를 정수로 입력받음. 범위는 (1 <= T <= 10000)

    [출력]
    T초를 위한 최소버튼 조작의 A, B, C 횟수를 첫 줄에 차례대로 출력함. 각 횟수 사이에 공백 존재.
    버튼을 누르지 않는다면 숫자 0을 출력한다.
    T=234와 같은 경우에는 음수 -1을 첫 줄에 출력한다.
 */

import java.util.Scanner;

public class MicrowaveMain {
    public static void main(String[] args) {
        int t, a, b, c;     // 요리 시간 t초, a는 5분버튼 A를 누르는 횟수, b는 1분 버튼 B 누르는 횟수, C는 10초 버튼 C 누르는 횟수
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        if(t % 10 != 0) {
            System.out.println("-1");
            return;
        }
        a = t / 300;
        b = t % 300 / 60;
        c = t % 300 % 60 / 10;
        System.out.printf("%d %d %d\n", a, b, c);
    }
}
