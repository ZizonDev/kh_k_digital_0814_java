package enum클래스1;
// 서로 연관된 상수들의 모음.
// 실제 값 뿐만 아니라 타입까지 체크 가능.
// 예전에 class에서 final static String ... 으로 정의해서 사용하던 방식을 대체할 수 있음.

import java.util.Calendar;

public class EnumType {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);       // 한 주에서 실제로 몇 번째 요일인지를 가져 옴.
        switch(week) {
            case 1 :
                today = Week.SUNDAY; break;
            case 2 :
                today = Week.MONDAY; break;
            case 3 :
                today = Week.TUESDAY; break;
            case 4 :
                today = Week.WEDNESDAY; break;
            case 5 :
                today = Week.THURSDAY; break;
            case 6 :
                today = Week.FRIDAY; break;
            case 7 :
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘은 " + today + "입니다.");
    }
}
enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}