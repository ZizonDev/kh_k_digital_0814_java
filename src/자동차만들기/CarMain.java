package 자동차만들기;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        final int[] distance = {0, 400, 150, 300, 300};         // [1]부산, [2]대전, [3]강릉, [4]광주 까지의 거리
        Car car = null;                 // 부모 클래스의 참조변수를 만드는 데 초기값으로 null을 대입. 초기값으로 아무것도 두지 않겠다.
        Scanner sc = new Scanner(System.in);

        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int city = sc.nextInt();

        System.out.print("이동할 승객 수 입력 : ");
        int passengerCnt = sc.nextInt();

        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carSet = sc.nextInt();

        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();

        boolean isMode = option == 1;
        switch(carSet) {
            case 1 : car = new SportsCar("Porsche 911"); break;
            case 2 : car = new Sedan("Genesis G80"); break;
            case 3 : car = new Bus("Express Bus"); break;
            default : System.out.println("차량 선택이 잘못 되었습니다.");
        }

        car.setMode(isMode);                                // 부가 기능 on / off
        int moveCnt = car.getMoveCnt(passengerCnt);         // 승객 수로 이동 횟수를 구하는 메소드.
        System.out.println("=".repeat(10) + car.getName() + "=".repeat(10));
        System.out.println("총 비용 : " + car.getTotalCost(distance[city], moveCnt) + "원");
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(distance[city], moveCnt) + "회");
        System.out.println("총 이동 시간 : " + car.getTotalTime(distance[city], moveCnt));
    }
}
