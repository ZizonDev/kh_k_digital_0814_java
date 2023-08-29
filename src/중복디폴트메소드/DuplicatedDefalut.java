package 중복디폴트메소드;

public class DuplicatedDefalut {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();               // order 누구꺼냐? Buy or Sell?
    }
}
