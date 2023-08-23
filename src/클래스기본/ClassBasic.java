package 클래스기본;

public class ClassBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("곰돌이사육사");
        s1.setAddr("경기도 수원시");
        s1.showInfo();
        Student s2 = new Student();
        s2.setName("안유진");
        s2.setAddr("서울시 강남구");
        s2.showInfo();
        Student s3 = new Student();
        s3.setName("김예령");
        s3.setAddr("서울시 동대문구");
        s3.showInfo();
    }
}
