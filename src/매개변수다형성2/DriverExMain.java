package 매개변수다형성2;

import java.util.Scanner;

public class DriverExMain {
    public static void main(String[] args) {
        Driver driver = new Driver("김예령");
        Bus bus = new Bus();
        SportsCar sportscar = new SportsCar();
        Taxi taxi = new Taxi();

        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차량을 선택하세요.");
        System.out.print("[1]Bus [2]Sports Car [3]Taxi : ");
        int selection = sc.nextInt();
        switch (selection) {
            case 1 : driver.drive(bus);
            break;
            case 2 : driver.drive(sportscar);
            break;
            case 3 : driver.drive(taxi);
            break;
            default : System.out.println("해당 차량이 없습니다.");
        }
    }
}

