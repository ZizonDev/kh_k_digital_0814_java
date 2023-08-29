package 중첩인터페이스;
// 중첩 인터페이스 : 클래스 내부에 선언된 인터페이스.
// 중첩 인터페이스는 주로 UI 프로그래밍에서 이벤트를 처리할 때 사용함.

public class DoubleInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());      // button.setOn~(버튼을 눌렀을 때 실행했으면 하는 일 입력)
        button.touch();                                     // 터치하면 위의 콜리스너 실행됨.
        button.setOnClickListener(new MessageListener());
        button.touch();                                     // 터치하면 메시지리스너 실행됨.
    }
}
