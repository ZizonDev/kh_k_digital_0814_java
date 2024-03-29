package 객체를배열로관리;

public class NameCard {
    private String name;
    private String mail;
    private String phone;
    private int age;
    private static int cnt = 0;


    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        cnt++;
        System.out.println("=".repeat(7)+ "명함" + cnt + "=".repeat(7));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("메일 : " + mail);
    }
}
