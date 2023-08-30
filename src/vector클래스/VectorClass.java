package vector클래스;
// Vector는 ArrayList 구조와 메소드가 동일. Vector는 동기화가 지원되어 멀티스레드 환경에서 안전함. 하지만 ArrayList 대비 성능 떨어짐.

import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("김예령", "kyr330@naver.com", "010-1234-5678", "개발자"));
        list.add(new NameCard("김현호", "khhgus617@naver.com", "010-5555-9999", "의사"));
        list.add(new NameCard("조수정", "crystal@naver.com", "010-9876-5432", "변호사"));

        for(NameCard e : list) {
            System.out.println("=".repeat(26));
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
        }
    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}