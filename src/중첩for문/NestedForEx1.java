package 중첩for문;
// 이중 반복문
public class NestedForEx1 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {               // i는 행
            for(int j = 0; j < 10; j++) {           // j는 열
                System.out.print("* ");             // i = 0일 때 j가 0부터 10 미만일 때까지 즉 10회 * 반복 -> 다시 for(i)로 올라가서 줄바꾸고 i = 1 -> 다시 j가 0부터 10미만일 때까지 * 10회 반복 -> ...
            }
            System.out.println();
        }

        for(int i = 0; i < 10; i++) {
            System.out.printf("|i = %d|", i);       // i가 0에서 9까지 변하는 과정을 표시해준 것.
            for (int j = 1; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i =2; i < 10; i++) {                               // i는 2단, 3단, 4단,..., 2단부터 시작.
            for (int j = 1; j < 10; j++) {                          // 2에 곱해지는 수, 즉 i * j.
                System.out.printf("%d x %d = %d\n", i, j, (i*j));
            }
            System.out.println();
        }
    }
}
