package 인터페이스활용;

public class InterfaceEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;           // customer 참조변수를 Buy 인터페이스형에 대입함.
        buyer.buy();                    // Buy 메소드를 상속받은 customer를 대입했기 때문에 buyer.buy()가 가능함.
//        buyer.sell();                 // Sell 인터페이스형에는 대입 안했기 때문에 불가능.

        Sell seller = customer;
        seller.sell();
        Customer customer2 = (Customer) seller;          // 다운캐스팅.
        customer2.buy();
        customer2.sell();                // customer2를 다시 원래의 Customer형으로 되돌려주면 buy(), sell() 둘다 가능함.
    }
}
