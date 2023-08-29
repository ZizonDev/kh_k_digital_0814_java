package enum클래스2;

public class EnumType2 {
    public static void main(String[] args) {
        Developer developer1 = new Developer("김예령", DevType.BIGDATA, Career.JUNIOR, Gender.FEMALE);
        developer1.DevInfo();
        Developer developer2 = new Developer("곰돌이사육사", DevType.FRONTEND, Career.SENIOR, Gender.MALE);
        developer2.DevInfo();
    }
}