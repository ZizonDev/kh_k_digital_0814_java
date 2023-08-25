package 디폴트메소드;

public interface RemoteController {
    int MAX_VOLUME = 100;           // interface에서 final static이 자동으로 적용된 경우.
    int MIN_VOLUME = 0;             // 리모컨을 설계하는 interface 단계에서 최대 볼륨을 미리 설정해보고 기록해 놓는 용도임.
    void turnON();                  // interface에서 public abstract가 자동으로 추가됨.
    void turnOFF();
    void setVolume(int vol);        // 기존 개발은 여기까지 interface 설계 끝났었음.

    // 디폴트 메소드는 JDK 8 이후에 추가됨. 디폴트 메소드는 예외적으로 interface 내에서 구현부를 넣을 수 있는 예약어.
    default void setMute(boolean mute) {   // 새롭게 mute 기능을 넣으라는 요구사항!!! 다 뜯어고치지 않도록 default로 추가해준다.
        if(mute) System.out.println("무음 모드를 실행합니다.");
        else System.out.println("무음 모드를 해제합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지를 교체하세요.");
    }

}
