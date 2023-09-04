package 스트림활용;

import java.util.ArrayList;
import java.util.List;

public class StreamEx8 {
    public static void main(String[] args) {
        TravelCustomer customerA = new TravelCustomer("안유진", 19, 300);
        TravelCustomer customerB = new TravelCustomer("이영지", 22, 100);
        TravelCustomer customerC = new TravelCustomer("미미", 28, 200);
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerA);
        customerList.add(customerB);
        customerList.add(customerC);
        customerList.add(new TravelCustomer("이은지", 32, 500));

        System.out.println("=".repeat(5) + " 고객 명단 입력 순 출력 " + "=".repeat(5));      // 입력 순.
        customerList.stream().map(c -> c.getName()).forEach(c -> System.out.print(c + " "));
        System.out.println();

        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.print("총 여행 비용 : " + total);
        System.out.println();

        System.out.println("=".repeat(5) + " 성인 명단 사전 순 출력 " + "=".repeat(5));
        customerList.stream()
                .filter(c -> c.getAge() >= 20)
                .map(c -> c.getName())
                .sorted()
                .forEach(c -> System.out.print(c + " "));
    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
