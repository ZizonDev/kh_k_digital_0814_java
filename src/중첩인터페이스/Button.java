package 중첩인터페이스;

public class Button {
    OnClickListener listener;           // 생성된 객체의 주소를 대입받기 위한 참조변수.
    void setOnClickListener(OnClickListener listener){      // setOn~ 에 OnClickListener형을 주입한다.
        this.listener = listener;
    }
    void touch() {
        listener.onClick();             // 구현하려는 객체의 onClick() 메소드 호출하는 것.
    }
    interface OnClickListener {         // 클래스 내부에서 인터페이스를 만듦.(중첩 인터페이스) 클릭이 되는지를 감지하는 인터페이스.
        void onClick();
    }
}
