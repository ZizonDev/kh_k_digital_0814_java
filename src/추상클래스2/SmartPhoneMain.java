package 추상클래스2;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 11");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
