package makeCar;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        CarTest car = null;
        int[] distance = {400, 150, 200, 300};
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int sel1 = sc.nextInt();

        System.out.print("이동할 승객 수 입력 (1 ~ 100) : ");
        int sel2 = sc.nextInt();

        System.out.print("이동 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int sel3 = sc.nextInt();
        switch(sel3) {
            case 1 : car = new SportsCar("Ferrari"); break;
            case 2 : car = new Sedan("Benz"); break;
            case 3 : car = new Bus("Premium Bus"); break;
        }

        System.out.print("부가 기능 선택 (ON / OFF) : ");
        String sel4 = sc.next();
        if(sel4.equalsIgnoreCase("on")) {
            car.choiceOption(true);
            car.moveNum = sel2;
        }
        else {
            car.choiceOption(false);
            car.moveNum = sel2;
        }

        System.out.println("=".repeat(10) + car.getCarName() + "=".repeat(10));
        System.out.println("총 비용 : " + car.totalCost(distance[sel1-1]) + "원");
        System.out.println("주유 횟수 : " + car.oilingNum(distance[sel1-1]) + "회");
        System.out.println("총 시간 : " + car.totalTime(distance[sel1-1]));
    }
}

