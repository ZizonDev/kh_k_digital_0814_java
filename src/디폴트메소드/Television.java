package 디폴트메소드;

public class Television implements RemoteController {
    private int volume;
    @Override
    public void turnON() {
        System.out.println("TV 전원을 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV 전원을 끕니다.");
    }

    @Override
    public void setVolume(int vol) {
        if(vol > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        } else if(vol < RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        RemoteController.super.setMute(mute);
    }
}
