package 중복디폴트메소드;

public interface Buy {
    void buy();                 // public abstract가 자동으로 추가됨.
    default void order() {      // interface 안에서 예외적으로 구현부를 가짐.
        System.out.println("Purchase Order");
    }
}
interface Sell {
    void sell();
    default void order() {
        System.out.println("Selling Order");
    }
}
class Customer implements Buy, Sell {
    @Override
    public void buy() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void order() {
        Buy.super.order();          // order가 Buy의 order인지, Sell의 order인지 오버라이딩해야 함. Buy 선택했음. Sell 넣어도 상관없음.
    }
}
