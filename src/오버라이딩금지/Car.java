package 오버라이딩금지;

public class Car {
    int speed;
    String color;
    String name;

    final void accelerator() {
        System.out.println("차의 속도를 증가시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다.");
    }
}

class SportCar extends Car {
    boolean isTurbo;
    SportCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }

//    @Override                               // 문법적으로 오버라이딩 되었는지를 확인하는 경우. 관례상 @Override 붙여주는 것이 좋음.
//    void accelerator() {                    // 앞에서 accelerator 앞에 final로 상수 선언이 되었기 때문에 오버라이딩 금지됨.
//        System.out.println("차의 속도를 200% 증가시킵니다.");
//    }
//    void breakPanel() {                     // 앞에서 breakPanel이 final로 상수 선언이 되었으므로 오버라이딩 금지.
//        System.out.println("차의 속도를 200% 감소시킵니다.");
//    }

    double getSpeed() {
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    public boolean isTurbo() {
        return isTurbo;
    }
    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보 모드 : " + isTurbo);
    }
}

class ElectricCar extends Car {
    boolean isAutoDrive;

    ElectricCar(String name) {
        isAutoDrive = false;
        speed = 200;
        this.name = name;
        color = "White";
    }

    public boolean isAutoDrive() {
        return isAutoDrive;
    }

    public void setAutoDrive(boolean autoDrive) {
        isAutoDrive = autoDrive;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrive);
    }
}
