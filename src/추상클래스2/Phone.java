package 추상클래스2;

public abstract class Phone {                   // Phone은 instance화 될 수 없음. (나중에 SmartPhone에 상속해줄 거니까)
    public String name;
    public boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if(isPower) System.out.println("Power ON");
        else System.out.println("Power OFF");
    }
    abstract void call();                   // 상속받을 자식이 call 기능을 오버라이딩으로 구현해야함.
}
