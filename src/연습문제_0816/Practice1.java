package 연습문제_0816;
/*
### 연습문제(1)

달력(양력)은 지구가 태양을 공전하는 시간을 기준으로 작성 된다.

양력에서의 1년은 지구가 태양을 1바퀴 도는데 걸리는 시간이며, 시간은 365일 과 1/4만큼 걸린다.

[윤년의 조건]

- 연도가 4로 나누어 떨어 진다.
- 100으로 나누어 떨어지면 연도는 윤년이 아니다.
- 400으로 나누어 떨어지면 윤년이다.
 */

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt();
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("윤년입니다.");
        }
        else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
