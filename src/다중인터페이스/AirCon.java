package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30;          // public final static이 앞에 생략되어 있음.
    int MIN_TEMP = 0;
    void airConON();            // 추상 메소드.
    void airConOFF();
    void setAirConTemp(int tmp);
}
