package 성적출력하기;

import java.util.Scanner;

/* 23. 08. 17
[연습 문제 1]
- 시험 성적을 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
- 0 ~ 100 사이가 아니면 성적이 잘못 입력되었다고 출력.

[심화] 성적이 잘못 입력된 경우 다시 입력받도록 수정하기. substring 이용.
 */

/* solution */
public class Grade {
    public static void main(String[] args) {
        //입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        //조건문을 만드는데 우선, 0 ~ 100 사이의 정상적인 입력인지 확인!!!
        while(true) {
            System.out.print("성적을 입력하세요 : ");
            int score = sc.nextInt();
            if (score < 0 || score > 100) continue;                 //조건문을 만드는데 우선, 0 ~ 100 사이의 정상적인 입력인지 확인!!!, continue는 다시 입력하게 이전으로 돌아가는 거.
            //정상적인 입력이었다면 성공적으로 조건문 수행
            if (score >= 90) System.out.println("A");               // 수행문이나 조건문이 한 줄이면 중괄호 빼도 됨.
            else if (score >= 80) System.out.println("B");          // 조건문에 범위 잡을 필요 없다. if-else문은 위에서부터 순차적으로 필터링되는 구조이기 때문.
            else if (score >= 70) System.out.println("C");
            else if (score >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }
    }
}



//public class Grade {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("시험 점수를 입력하세요 : ");
//        int grade = sc.nextInt();
//        if (90 <= grade && grade <= 100 ) {
//            System.out.println("당신의 성적은 A입니다.");
//        }
//        else if (80 <= grade  && grade < 90) {
//            System.out.println("당신의 성적은 B입니다.");
//        }
//        else if (70 <= grade && grade < 80) {
//            System.out.println("당신의 성적은 C입니다.");
//        }
//        else if (60 <= grade && grade < 70) {
//            System.out.println("당신의 성적은 D입니다.");
//        }
//        else if (0 <= grade && grade < 60) {
//            System.out.println("당신의 성적은 F입니다.");
//        }
//        else {
//            System.out.println("성적이 잘못 입력되었습니다.");
//        }
//    }
//}
