package 클래스정렬하기1;

public class CarComparable implements Comparable<CarComparable> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComparable(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    // return 1 : 조건에 따라 정렬을 해야 됨.
    // return -1 : 이미 조건에 부합하니까 정렬 안해도 됨.
    // return 0 : 정렬 조건은 아니지만 Set을 사용하는 경우 중복값을 제거하는 조건이 됨. ex) year 기준 같음 -> color로 비교했는데도 같음 -> name도 같음 -> 중복값을 제거한다. (return 0)
    public int compareTo(CarComparable o) {         // 클래스를 정렬할 조건.
        if (this.modelYear > o.modelYear) return 1;  // 연식별 오름차순 정렬. 지금 연식이 뒤에 들어오는 연식보다 크면 뒤로 보내라. 정렬해라.
        else {
            if (this.modelYear == o.modelYear) {        // 연식이 같으면
                return this.modelName.compareTo(o.modelName);  // compareTo : 사전 순 정렬
            }
        }
        return -1;                                      // else도 아니면 걍 그대로 둬라. 만약 return 0을 하면 중복값을 지워버림.
    }
}
