package 게터와세터;

public class CarTest {
    String manufacturer;           // 제조사
    String modelName;              // 모델명
    String color;
    String year;                   // 출고년도
    int maxSpeed;

    public CarTest(String manufacturer, String modelName, String color) {     // 우클릭 -> 알트+인서트 -> constructor
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.color = color;
    }

    public String getManufacturer() {                                         // 우클릭 -> 알트+인서트 -> Getter and Setter
        return manufacturer;                                                  // 나중에는 @Getter @Setter 이용함. ㅋ
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
