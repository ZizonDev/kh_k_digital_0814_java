package 회원정보예제;

public class MemberClass {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo();       // 멤버클래스를 바탕으로 MemnerInfo에 대한 참조 타입 변수 생성.
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.getInfo();
    }
}
