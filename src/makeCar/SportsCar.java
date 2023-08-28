package makeCar;

public class SportsCar extends CarTest{
    public SportsCar(String name) {
        speed = 250;
        fuelEff = 8;
        tankSize = 30;
        seats = 2;
        isOption = false;
        this.carName = name;
        if (isOption == true) {speed *= 1.2;}
    }
}

