package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCal {
    public static void main(String[] args) {

        // Date class : 운영체제로부터 날짜와 시간 정보를 가져와서 원하는 포맷으로 출력해 준다. 객체를 생성해야 한다. import 필요함.
        Date now = new Date();
        System.out.println(now);            // 요일 월 일 시:분:초 KST 년도 ex) Tue Aug 29 15:41:07 KST 2023
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");             // 원하는 포맷으로 변경하기
        System.out.println( sdf.format(now) );
        
        // yyyy : 년도를 4자리로 표시
        // yy : 년도를 2자리로 표시
        // MM : 2자리로 월 표시 (대문자임에 유의!!! mm이면 minute임.)
        // M : 숫자 하나만 표시, 9월의 경우 9, 12의 경우 12
        // dd : 일 표시
        // HH : 24시간제
        // hh : 12시간제
        // mm : 분
        // ss : 초
        // W : Week, 이 달의 몇 번째 주인지.
        // w : 1년 중 몇 번째 주인지.
        
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("오늘은 M월 W번째 주, d번째 날입니다.");
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        f7 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

        // Calendar class : getInstance() 메소드를 사용한다. 객체 생성은 안 함.
        Calendar cal = Calendar.getInstance();          // 운영체제로부터 시간을 가져옴.
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));    // 8월은 7로 찍힌다. index 7 자리이기 때문.
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));   // 한 주의 몇 번째 날인지 출력. (화요일은 3)
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));  // 한 달의 몇 번째 날인지.
        System.out.println(cal.get(Calendar.AM_PM));         // AM이면 0, PM이면 1 출력;
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        // Calendar 클래스로 yyyy년 MM월 dd일 HH시 mm분 ss초 포맷으로 출력하기.
        Calendar cal2 = Calendar.getInstance();
        int yyyy = cal2.get(Calendar.YEAR);
        int MM = cal2.get(Calendar.MONTH) + 1;              // 중요!!!!!!!!!!!!!!
        int dd = cal2.get(Calendar.DATE);
        int isAm = cal2.get(Calendar.AM_PM);
        String amPm = " ";
        if (isAm == 0) amPm = "오전";
        else if (isAm == 1) amPm = "오후";
        int HH = cal2.get(Calendar.HOUR);
        int mm = cal2.get(Calendar.MINUTE);
        int ss = cal2.get(Calendar.SECOND);
        System.out.printf("%d년 %02d월 %d일 %s %02d시 %02d분 %d초\n", yyyy, MM, dd, amPm, HH, mm, ss);        // %02d : 두자리 정수로 표현해줘!!!
    }
}
