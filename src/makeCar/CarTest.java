package makeCar;

public abstract class CarTest {
    protected int speed;
    protected int fuelEff;
    protected int tankSize;
    protected int seats;
    protected String carName;
    protected int moveNum;
    protected boolean isOption;

    public String getCarName() {
        return carName;
    }

    public int oilingNum (int sel1) {
        int oilingNum;
        this.moveNum = moveNum;
        if ((sel1 / fuelEff * moveNum) % tankSize == 0) {
            oilingNum = sel1 / tankSize / fuelEff * moveNum;
        } else oilingNum = sel1 / tankSize / fuelEff  * moveNum + 1;
        return oilingNum;
    }

    public int totalCost(int sel1) {
        this.moveNum = moveNum;
        int totalCost = sel1 / fuelEff * 2000 * moveNum;
        return totalCost;
    }

    public int totalTime(int sel1) {
        this.moveNum = moveNum;
        int totalTime = sel1 / speed * moveNum;
        return totalTime;
    }

    public void choiceOption(boolean isOption) {
        this.isOption = isOption;
    }
}
