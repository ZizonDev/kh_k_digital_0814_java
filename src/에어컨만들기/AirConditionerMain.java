package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConditionerMain {
    public static void main(String[] args) throws InterruptedException {
        AirConditioner samsungAirCon = new AirConditioner();
        int elapsedTime = 0;                          // 경과 시간을 계산하기 위한 변수.
        boolean isSetTemper = false;                  // 온도를 변경할 조건이 맞는지 확인하기 위한 변수. 즉 사전에 온도가 설정이 잘 되었느냐.
        Scanner sc = new Scanner(System.in);
        System.out.print("전원을 켜시겠습니까? (yes/no) : ");
        String isOn = sc.next();
        if(isOn.equalsIgnoreCase("yes")) {
            samsungAirCon.setPower(true);
            samsungAirCon.airConditionerState();
            while (true) {
                sleep(1000);                    // 1000/1000초마다 한번씩 잔다. 즉 1초 delay.
                elapsedTime++;                        // 경과 시간이 1초마다 1씩 증가함.
                switch (samsungAirCon.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemper = true; break;
                    case 2 : if(elapsedTime >= 30) isSetTemper = true; break;
                    case 3 : if(elapsedTime >= 10) isSetTemper = true; break;
                    default : if(elapsedTime >= 61) isSetTemper = true;
                }
                if (isSetTemper) {
                    if (samsungAirCon.isHeater()) samsungAirCon.setCurrentTemper(1);
                    if (samsungAirCon.isCooler()) samsungAirCon.setCurrentTemper(-1);
                    samsungAirCon.airConditionerInfo();
                    isSetTemper = false;             // 온도 변경 이후 온도 변경할 조건이 맞는지를 확인하는 값을 초기화
                    elapsedTime = 0;                 // 온도 변경 이후 경과 시간 초기화.
                }
                if(samsungAirCon.getCurrentTemper() == samsungAirCon.getSetTemper()) {
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }
        }
    }
}
