package 인터페이스;

public interface NetworkAdapter {
    void connect();         // interface 내에서 자동으로 (public abstract) 포함됨. interface에서는 public abstract가 디폴트값임.
}

class LAN implements NetworkAdapter {       // 유선 인터넷.
    String company;
    LAN(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LAN에 연결되었습니다.");
    }
}

class WiFi implements NetworkAdapter {      // 무선 인터넷.
    String company;
    WiFi(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " Wi-Fi에 연결되었습니다.");
    }
}

class FiveG implements NetworkAdapter {      // 5세대 광역 통신망
    String company;
    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결되었습니다.");
    }
}