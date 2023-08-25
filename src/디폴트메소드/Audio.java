package 디폴트메소드;

public class Audio implements RemoteController {
    private int volume;

    @Override
    public void turnON() {
        System.out.println("Audio 전원을 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio 전원을 끕니다.");
    }

    @Override
    public void setVolume(int vol) {
        if(vol > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        } else if(vol < RemoteController.MIN_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }

    void getInfo() {
        System.out.println("Audio 입니다.");
        System.out.println("현재 Audio 볼륨은 " + volume + " 입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if (mute) System.out.println("Audio에서 무음 모드가 실행됩니다.");
        else System.out.println("Audio에서 무음 모드를 해제합니다.");
    }
}
