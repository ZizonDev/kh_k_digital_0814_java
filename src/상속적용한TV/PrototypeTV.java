package 상속적용한TV;
// 시제품 TV를 먼저 만들어 이 기능을 새로운 TV에 상속한다.

public class PrototypeTV {
    boolean isPower;        // 전원값 저장
    int channel;            // 채널 정보 저장
    int volume;             // 볼륨값 저장
    public PrototypeTV() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }
    public PrototypeTV(boolean isPower, int channel, int volume) {          // 생성자 오버로딩
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel (int ch) {
        if(ch > 0 && ch < 1000) {
            channel = ch;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
