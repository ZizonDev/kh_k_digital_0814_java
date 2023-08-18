package 알람시간출력하기;

import java.util.Scanner;

/*
    <45분 일찍 알람 설정하기>
    [입력] 첫째 줄에 두 정수 H와 M이 주어진다. (0 <= H <= 23, 0 <= M <= 59) <- 현재 설정한 알람 시간 H시 M분
          현재 시간에서 45분 일찍 알람을 설정하려고 함.
          입력 시간은 24시간 표현 사용. 시간을 나타낼 때 불필요한 0은 나타내지 않는다.
    [출력] 설정해야 하는 알람 시간을 첫째 줄에 두 정수 H와 M을 출력한다.
 */
public class AlarmEarly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간과 분 입력 : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int totalMin = hour * 60 + min;
        if (totalMin < 45) {                        // 0시 0분 ~ 0시 44분까지를 고려한 것. -> 0시에서 전 날 23시로 넘어가기 때문.
            totalMin = 24 * 60 + totalMin;          // 23시 xx분을 표현하기 위함.
        }
        totalMin -= 45;                             // totalMin에서 45분 전을 구한 것.
        System.out.println((totalMin / 60) + "시 " + (totalMin % 60) + "분");     // totalMin은 분 단위로 나타낸 거니까 60으로 나눴을 때 몫은 시 단위고, 나머지는 분 단위임.
    }
}
//        System.out.print("몇 시로 할까요? : ");
//        int hour = sc.nextInt();
//        System.out.print("몇 분으로 할까요? : ");
//        int minute = sc.nextInt();
//        System.out.println("H : " + hour + " | " +  "M : " + minute);
//        System.out.println("");
//
//        if (hour == 0) {
//
//            if (minute > 45) {
//                System.out.println("===== 45분 일찍 깨워주는 알람 =====");
//                System.out.println("H : 23 | M : " + (minute - 45));
//            } else if (minute == 45 | minute == 0) {
//                System.out.println("===== 45분 일찍 깨워주는 알람 =====");
//                System.out.println("H : 23 | M : 00");
//            } else {
//                System.out.println("===== 45분 일찍 깨워주는 알람 =====");
//                System.out.println("H : 23 | " + "M :" + (minute + 25));
//            }
//        } else {
//            if (minute > 45) {
//                System.out.println("===== 45분 일찍 깨워주는 알람 =====");
//                System.out.println("H : " + (hour - 1) + " | " + "M : " + (minute - 45));
//            } else if (minute == 45) {
//                System.out.println("===== 45분 일찍 깨워주는 알람 =====");
//                System.out.println("H : " + (hour - 1) + " | " + "M : 00");
//            } else if (minute == 0) {
//                System.out.println("===== 45분 일찍 깨워주는 알람 =====");
//                System.out.println("H : " + (hour - 1) + " | " + "M : 00");
//            } else {
//                System.out.println("===== 45분 일찍 깨워주는 알람 =====");
//                System.out.println("H : " + (hour - 1) + " | " + "M : " + (minute + 25));
//            }
//        }
//    }
//}


