package 추상클래스2;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 11");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new Phone("Mockup") {         // Phone은 abstract가 걸려 있는 추상클래스이기 때문에 객체화 될 수 없음.
            @Override                                     // Phone의 클래스를 안 만들고 한 대만 폰만들고 끝내겠다. 구현부를 사용하고 닫아줌으로써 클래스 안만듦. -> 익명의 객체.
            void call() {
                System.out.println("목업폰이라 통화가 안 돼요...ㅠㅠ 한 번 구현해보고 버릴 거라서 ㅋㅋ");
            }
        };
        phone.call();
    }
}
