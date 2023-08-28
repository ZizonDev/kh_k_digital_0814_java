package 자동차만들기;

// 상속을 주기 위한 Car 클래스
public abstract class Car {
    protected int maxSpeed;         // 최고 속도, protected는 같은 패키지와 상속 관계에서 접근 가능함.
    protected int fuelEff;          // 연비 (1리터 당 주행 거리(km))
    protected int fuelTank;         // 연료 탱크 크기
    protected int seatCnt;          // 좌석 수
    protected String name;          // 자동차 이름

    abstract void setMode(boolean isMode);      // 상속 받은 각 자동차의 부가 기능 설정.

    public String getName() {
        return name;
    }

    // 반복적으로 사용되는 변수들
    int getMoveCnt(int passengerCnt) {          // 총 이동 횟수 getMoveCnt 구하기 위해 입력값으로 승객 수(passengerCnt) 필요
        if(passengerCnt % seatCnt != 0) return (passengerCnt/seatCnt) + 1;
        else return (passengerCnt/seatCnt);
    }
    int getRefuelCnt(int distance, int moveCnt) {       // 주유 횟수 getRefuelCnt 구하기 위해 이동 거리와 이동 횟수를 입력받음.
        if((distance * moveCnt / fuelEff) % fuelTank != 0) return (distance * moveCnt) / fuelEff / fuelTank + 1;
        else return (distance * moveCnt) / fuelEff / fuelTank;
    }
    int getTotalCost(int distance, int moveCnt) {       // 총 비용 getTotalCost
        // double disCost = (double)distance / fuelEff * 2000;
        // return (int)(disCost * moveCnt);
        return distance / fuelEff * 2000 * moveCnt;
    }
    String getTotalTime(int distance, int moveCnt){     // 총 소요 시간 getTotalTime
        double getTime = (double) distance * moveCnt / maxSpeed;
        int totalMinute = (int) (getTime * 60);
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        return String.format("%d시간 %d분", hour, minute);
    }
}
