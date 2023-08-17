package 행사메일발송하기;

import java.util.Scanner;

/*
- 문제 설명

    행사 안내 메일 발송하기

    ---

    1. 사용자로부터 이름, 제목, 날짜(20230817), 시간(17) 정보를 입력받습니다.
    2. 입력된 날짜의 월을 추출하여 해당하는 계절을 판단합니다. (20230314)
    3. 계절에 따라 적절한 인사말과 입력된 일정 정보를 출력합니다.

    ---

    프로그램은 다음과 같은 방식으로 동작해야 합니다.

    - 1월부터 12월까지의 월 정보를 입력 받습니다.
    - 입력된 월에 따라 다음과 같은 계절 정보를 출력합니다.
        - 12월, 1월, 2월 → "한파의 연속인 1월 입니다."
        - 3월 → "봄의 기운이 느껴지는 3월 입니다."
        - 4월 → "새싹이 피어나는 4월 입니다."
        - 5월 → "계절의 여왕 5월 입니다."
        - 6월 → "활동하기 좋은 6월 입니다."
        - 7월 → "휴가가 기다려지는 7월 입니다."
        - 8월 → "무더운 8월 입니다."
        - 9월 → "선선한 9월 입니다."
        - 10월 → "천고마비의 계절 10월 입니다."
        - 11월 → "쓸쓸한 늦가을 11월 입니다."
    - 입력된 이름, 제목, 날짜, 시간 정보와 계절 정보를 이용하여 다음과 같은 형식으로 일정 정보를 출력합니다.

    [Hint] 문자열의 substring을 이용하면 원하는 문자를 추출할 수 있음.
           ex) date = "20230817";
               month = date.substring(4,6);          // 4번째 문자열부터 6번째 문자열 미만 !!!
 */
public class Mailing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================== 행사 메일 발송 양식 ====================");
        System.out.print("이름 : ");
        String name = sc.nextLine();                // 이름 입력하고 엔터치면 넘어가게끔
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("날짜 : ");
        String ymd = sc.nextLine();
        System.out.print("시간 : ");
        String time = sc.nextLine();

        String year = ymd.substring(0, 4);          // index는 0부터 시작. 0 즉 첫번째 문자부터 4 즉 다섯번째 문자 미만까지
        String month = ymd.substring(4, 6);
        String date = ymd.substring(6);
        String greeting = "";
        switch(month) {
            case "01" : greeting = "한파의 연속인 1월입니다."; break;
            case "02" : greeting = "눈이 내리는 2월입니다."; break;
            case "03" : greeting = "봄의 기운이 느껴지는 3월입니다."; break;
            case "04" : greeting = "새싹이 피어나는 4월입니다."; break;
            case "05" : greeting = "계절의 여왕 5월입니다."; break;
            case "06" : greeting = "활동하기 좋은 6월입니다."; break;
            case "07" : greeting = "휴가가 기다려지는 7월입니다."; break;
            case "08" : greeting = "무더운 8월입니다."; break;
            case "09" : greeting = "선선한 9월입니다."; break;
            case "10" : greeting = "천고마비의 계절 10월입니다."; break;
            case "11" : greeting = "쓸쓸한 늦가을 11월입니다."; break;
            case "12" : greeting = "크리스마스가 있는 12월입니다."; break;
            default : System.out.println("알 수 없는 날짜입니다.");          // default를 설정하였으므로 greeting 초기화해줘야.
        }

        System.out.println("");
        System.out.println(name + "님.");
        System.out.println(greeting);
        System.out.println("아래의 일정으로 " + title + "를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.\n");
        System.out.println("=".repeat(20) + " 행사 안내 " + "=".repeat(20));
        System.out.println("행사 안내 : " + title);
        System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
        System.out.println("시    간 : " + time + "시");

    }

//    public static void main(String[] args) {
//        System.out.println("=============== 행사 메일 발송 양식 ===============");
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);
//        Scanner sc4 = new Scanner(System.in);
//        System.out.println("이름을 입력하세요 : ");
//        System.out.println("제목을 입력하세요 : ");
//        System.out.println("날짜를 입력하세요 (예시 20230817) : ");
//        System.out.println("시각을 입력하세요 (예시 17) : ");
//        String name = sc1.next();
//        String title = sc2.next();
//        String ymd = sc3.next();
//        int time = sc4.nextInt();
//        String year = ymd.substring(0, 4);
//        String month = ymd.substring(4, 6);
//        String date = ymd.substring(6);
//        switch (month) {
//            case "01" :
//            case "02" :
//            case "12" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("한파의 연속인 겨울입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "03" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("봄의 기운이 느껴지는 3월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "04" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("새싹이 피어나는 4월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "05" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("계절의 여왕 5월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "06" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("활동하기 좋은 6월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "07" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("휴가가 기다려지는 7월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "08" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("무더운 8월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "09" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("선선한 9월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "10" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("천고마비의 계절 10월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//            case "11" :
//                System.out.println("");
//                System.out.println(name + "님.");
//                System.out.println("쓸쓸한 늦가을 11월입니다.");
//                System.out.println("아래의 일정으로 " + title + "을 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
//                System.out.println("");
//                System.out.println("============================== 행사 안내 ==============================");
//                System.out.println("행사 안내 : " + title);
//                System.out.println("일    시 : " + year + "년 " + month + "월 " + date + "일 ");
//                System.out.println("시    간 : " + time + "시");
//                break;
//        }
//    }
}
