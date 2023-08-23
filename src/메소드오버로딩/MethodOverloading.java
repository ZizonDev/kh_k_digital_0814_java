package 메소드오버로딩;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum("100", 200));
        System.out.println(sum(100, 200, 300));
    }
    static int sum(int x, int y) {
        return x + y;
    }
    static String sum(String x, int y) {                // 매개변수의 타입이 다르므로 오버로딩 성립.
        return x + y;
    }
    static int sum(int x, int y, int z) {               // 매개변수의 개수가 다르므로 오버로딩 성립.
        return x + y + z;
    }
//    static double sum(int x, int y, int z) {          // 반환 타입이 다른 경우 오버로딩이 성립X.
//        return x + y + z;
//    }
}
