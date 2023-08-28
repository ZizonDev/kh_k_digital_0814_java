package makeCar;

public class Bus extends CarTest {
     public Bus(String name) {
        speed = 150;
        fuelEff = 5;
        tankSize = 100;
        seats = 20;
        isOption = false;
        this.carName = name;
        if (isOption == true) {tankSize += 30;}
    }
}
