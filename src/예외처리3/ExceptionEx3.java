package 예외처리3;
// NullPointerException(NPE) : java에서 발생하는 대표적인 런타임 에러. 참조하려는 객체가 없는 경우에 발생.

public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;                       // null 자리에 new Test() 가 왔다면 참조하는 객체가 생성되어 오류가 안났을 것임.
        try {
            String testStr = test.name;         // NullPointerException 발생.
            System.out.println(testStr);
        } catch (NullPointerException e) {      // NPE는 try-catch로 에러 발생한 것을 덮어버리는 것은 XXXXXX!!!
            System.out.println("NPE가 발생하였습니다.");
        }

        if(test != null) {                      // 전통적인 if-else문으로 방어코드를 작성하는 것이 Better!!!!!!
            String testStr = test.name;
            System.out.println(testStr);
        } else {
            System.out.println("Test를 참조하려는 객체 test가 없습니다.");
        }

    }
}
class Test {                                    // Test가 인스턴스화 되지 않았음
    String name = "곰돌이 사육사";
}
