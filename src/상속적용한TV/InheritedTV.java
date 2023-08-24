package 상속적용한TV;
// 이전에 만들었던 TV에서 상속 관계를 적용하고 오버라이딩의 이점 확인.

public class InheritedTV {
    public static void main(String[] args) {
        PrototypeTV prototypeTV = new PrototypeTV();        // 추상화가 걸리면 prototypeTV라는 객체 자체가 생성되지 않음. 즉, 상속을 주는 클래스가 인스턴스화된다는 의미는 추상화가 아니라는 것.
        ProductTV smartTV = new ProductTV("우리 집 TV");
        smartTV.setPower(true);
        smartTV.setVolume(120);                             // 볼륨의 범위는 100까지니까 120으로 설정하면 기본값 10이 출력됨.
        smartTV.setChannel(1500, false);        // 채널 범위는 2000까지 업그레이드 해줘서 1500 그대로 출력됨.
        smartTV.viewTV();
    }
}
