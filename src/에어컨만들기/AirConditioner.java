package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

/*
    [에어컨 기능 설계]
    -전원 on/off
    -온도 설정 (1도 단위)
    -현재 온도 표시
    -냉방기(cooler) on/off
    -난방기(heater) on/off
    -바람 세기 설정 (1단/2단/3단)

    [설정 조건 및 동작]
    -설정된 온도에 따라 온도 조정 기능 (60초/30초/20초) 주기로 온도 변함
    -에어컨 on/off 동작을 위해 Scanner 활용해 문자열 입력 받음
    -현재 온도 표시를 위한 Calendar api 활용
 */
public class AirConditioner {
    private boolean isPower;                    // true/false 경우 뿐만 아니라 두 가지 값만 갖는 경우 boolean 최대한 활용할 것.
    private int setTemper;
    private int currentTemper;
    private boolean isCooler;
    private boolean isHeater;
    private int windStep;

    AirConditioner() {
        final int[] MONTHTEMPER = {-5, 3, 10, 19, 25, 28, 30, 32, 24, 16, 8, 1};   // index 0은 1월임. index가 1부터 시작한다고 보면 됨.
        Calendar now = Calendar.getInstance();       // Calendar는 객체를 생성할 수 없는 아이라서 getInstance 사용함.
        int month = now.get(Calendar.MONTH);         // (MONTH는 대문자 -> 객체x, static field에 할당) 배열의 index와 month 정수가 동일함.
        currentTemper = MONTHTEMPER[month];          // month=7이면 MONTHTEMPER[7]인 7월의 평균 기온 30을 가져옴.
        isPower = false;
        setTemper = 20;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    void airConditionerInfo() {
        String powerStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String [] windStr = {"", "1단", "2단", "3단"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전    원 : " + powerStr);
        System.out.println("현재 온도 : " + currentTemper);
        System.out.println("설정 온도 : " + setTemper);
        System.out.println("난    방 : " + heaterStr);
        System.out.println("냉    방 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
    }
    public void airConditionerState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currentTemper + "도 입니다.");
        System.out.print("온도를 설정하세요 : ");
        setTemper = sc.nextInt();
        System.out.println("설정 온도는 " + setTemper + "도 입니다.");
        System.out.print("바람 세기를 설정하세요 (1단/2단/3단) : ");
        windStep = sc.nextInt();
        if (currentTemper > setTemper) {
            System.out.println("냉방이 시작됩니다.");
            isCooler = true;
            isHeater = false;
        }
        else if (currentTemper < setTemper) {
            System.out.println("난방이 시작됩니다.");
            isHeater = true;
            isCooler = false;
        }
        else {
            isCooler = false;
            isHeater = false;
        }
    }
    public void setPower(boolean power) {       // Getter와 Setter는 내부에서 프로그래밍할 때가 아닌 외부에서 사용할 때 필요한 경우 생성함.
        isPower = power;
    }
    public int getWindStep() {
        return windStep;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public void setCurrentTemper(int n){        // 매개변수의 정수값을 받아 현재 온도를 변경해 줌. n은 1 단위로 움직임.
        currentTemper += n;
    }
    public int getCurrentTemper() {             // 현재 온도를 읽는 메소드
        return currentTemper;
    }
    public int getSetTemper() {                 // 설정 온도를 읽는 메소드
        return setTemper;
    }
}
