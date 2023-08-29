package object클래스2;

public class CloneObject {
    // clone() : 해당 instance를 복제하고, 새로운 instance를 생성해 반환. -> 얕은 복사(Object클래스1의 car01과 car03을 같다고 두었던 경우) 해결할 때 씀.
    public static void main(String[] args) {
        Member mem1 = new Member("kyr330", "김예령", "123456", 20, true);
        Member mem2 = new Member("khhgus617", "김현호", "654321", 10, false);
        Member mem3 = mem1;             // 얕은 복사 발생. mem1이 아래에 설정한 mem3 값으로 바귀어 출력된다.
        mem3 = mem1.getMember();        // 얕은 복사 해결.
        mem3.id = "Crystalism";
        mem3.name = "조수정";
        mem3.password = "987654321";
        mem1.viewInfo();
        mem2.viewInfo();
        mem3.viewInfo();
    }
}
