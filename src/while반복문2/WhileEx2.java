package while반복문2;
// 반복 횟수를 알 수 없는 경우에 대한 예제

// do ~ while문 : 이 예제에서 나이 입력받는 과정을 do의 수행문으로 넣어서 한번은 실행되게 하고 나머지 while문이 무한반복하다 조건이 참일 때만 나가게 할 수도 있음.
import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        int age;                        // 나이를 입력받는 변수.
        Scanner sc = new Scanner(System.in);
        while (true) {                   // 무한의 횟수를 반복!!!하기 위해 조건식을 참으로 만들었음. (반드시 탈출문이 필요함. or break;)
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) break;        // 1부터 199 사이인 정수만 정상 입력된 나이로 간주함. 여기서 break;는 while문에 대한 break.
            System.out.println("나이를 잘못 입력하셨습니다.");

        }
//        do {
//            System.out.print("나이를 입력하세요 : ");
//            Scanner sc = new Scanner(System.in);
//            age = sc.nextInt();
//        } while (age <= 0 || age >= 200);           // 탈출 조건이 필요없다. while문 탈출에 필요한 조건식을 만들었기 때문.

        System.out.println("입력하신 나이는 " + age + "세입니다.");
    }
}
