package 코코아톡만들기;

public class KokoaTalk {
    private String to;      // 상대방 이름
    private String msg;     // 전달할 내용. 메시지.
    public KokoaTalk(String name) {
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = to + "에게... " + msg;
    }
    public void send(NetworkAdapter netadapt) {
        netadapt.send(msg);
    }
}
