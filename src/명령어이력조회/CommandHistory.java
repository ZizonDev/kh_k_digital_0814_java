package 명령어이력조회;
// Queue : FIFO(First In First Out) 구조.
// Queue는 LinkedList를 활용함. LinkedList는 중간 삽입, 삭제가 자유로운데 그 기능을 Queue에서는 제한함으로써 FIFO 구현.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CommandHistory {
    Queue <String> queue = new LinkedList<>();
    final static  int MAX_SIZE = 10;
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        System.out.println("help 입력 시 도움말을 볼 수 있습니다.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");
            String command = sc.nextLine().trim();          // trim : 공백을 인지하지 않게 입력 받은 문자열 앞 뒤의 공백 제거.
            if (command.equalsIgnoreCase("q")) {
                System.exit(0);                      // q를 입력하면 프로그램 강제 종료.
            } else if (command.equalsIgnoreCase("help")) {
                System.out.println("help : 도움말을 보여줍니다.");
                System.out.println("q/Q : 프로그램을 종료합니다.");
                System.out.println("history : 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
            } else if (command.equalsIgnoreCase("history")) {
                history.save(command);
                int cnt = 0;
                for (String e : history.queue) {
                    cnt++;
                    System.out.println(cnt + " " + e);
                }
            } else {
                history.save(command);
                System.out.println(command);
            }
        }
    }
    void save(String command) {
        queue.offer(command);                               // queue에 command를 추가한다. add와 다른점은 예외가 발생하면 exception을 띄우지 않고 false를 반환한다.
        if(queue.size() > MAX_SIZE) queue.remove();         // queue의 사이즈가 일정 크기 이상 커지면 앞에서부터 로그를 지운다.
    }
}
