package 매개변수다형성2;

public class Vehicle {
    public void run() {
        System.out.println("차량이 달립니다. =3 =3 =3");
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다. =3 =3 =3");
    }
}
class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("스포츠카가 달립니다. =3 =3 =3");
    }
}
class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다. =3 =3 =3");
    }
}