package 코코아톡만들기;

public interface NetworkAdapter {
    void connect();
    void send(String msg);
}

class WiFi implements NetworkAdapter {

    @Override
    public void connect() {
        System.out.println("Connect Wifi Successful!");
    }

    @Override
    public void send(String msg) {
        System.out.println("Wifi >>> " + msg);
    }
}

class FiveG implements NetworkAdapter {

    @Override
    public void connect() {
        System.out.println("Connect 5G Successful!");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >>> " + msg);
    }
}