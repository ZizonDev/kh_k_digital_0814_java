package hashSet객체비교;

import java.util.HashSet;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "카리나");
        Member member2 = new Member(1002, "윈터");
        Member member3 = new Member(1003, "지젤");
        Member member4 = new Member(1004, "닝닝");

        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
        for (Member e : hashSet) e.viewMember();

    }
}

class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {         // 다운 캐스팅이 성립하는 지 확인.
            Member member = (Member) obj;  // 원래의 형으로 변환.
                if (this.id == member.id) return true;
                else return false;
        }
        return false;
    }
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void viewMember(){
        System.out.println("아이디 : " + id);
        System.out.println("이 름 : " + name);
    }
}
