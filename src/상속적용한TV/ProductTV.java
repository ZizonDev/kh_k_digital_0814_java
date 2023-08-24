package 상속적용한TV;
// 시제품을 기반으로 한 양산형 TV
public class ProductTV extends PrototypeTV {            // PrototypeTV로부터 상속 받아 ProductTV class 생성.
    String name;
    boolean isInternet;
    ProductTV() {
        name = "Smart TV";
    }
    ProductTV(String name) {
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }
    void setPower(boolean isPower) {
        this.isPower = isPower;
    }
    void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else System.out.println("볼륨 설정 범위를 벗어났습니다.");
    }

    // 오버라이딩 : 부모 객체에게서 물려받은 기능을 재정의하여 사용하는 것. <동적 다형성>
    // 오버라이딩 사용 시 내부적으로 [동적 바인딩 - 상속 시 기능 결합 과정에서(런타임 도중) 부모꺼 쓸건지 자식꺼 쓸건지] 발생.
    @Override           // Annotation (문법적 오류 있는지 여부 확인.)
    public void setChannel(int ch) {                    // 첫 번째 오버라이딩.
        if(ch > 1 && ch < 2000) {                       // 1. 채널 기능 업그레이드. (2000번 까지)
            channel = ch;
            System.out.println("채널을 " + channel + "번으로 변경하였습니다.");
        } else System.out.println("채널 설정 범위를 벗어났습니다.");
    }

    // 메소드 오버로딩 : 동일한 이름의 메소드를 매개변수의 타입이나 개수에 차이를 두어 구분하는 것. <정적 다형성>
    public void setChannel(int ch, boolean isInternet) {    // 두 번째 오버라이딩.
        if(isInternet) {                                    // 2. 인터넷 기능 추가.
            System.out.println("인터넷 모드입니다.");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if(ch > 1 && ch < 2000) {
                channel = ch;
                System.out.println("채널을 " + channel + "번으로 변경하였습니다.");
            } else System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }
    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + isInternet);
    }
}
