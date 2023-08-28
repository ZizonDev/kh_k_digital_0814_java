package makeCar;

public class Sedan extends CarTest {
    public Sedan(String name) {
        speed = 200;
        fuelEff = 12;
        tankSize = 45;
        seats = 4;
        isOption = false;
        this.carName = name;
        if (isOption == true) {seats += 1;}
    }
}
