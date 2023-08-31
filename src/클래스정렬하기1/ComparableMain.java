package 클래스정렬하기1;
// Comparable, Comparator : 클래스에 대한 정렬을 구현할 수 있도록 해 주는 인터페이스.

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<CarComparable> list = new TreeSet<>();
        list.add(new CarComparable("Santafe", 2016, "White"));
        list.add(new CarComparable("Sorento", 2012, "Silver"));
        list.add(new CarComparable("Grandeur", 2018, "Red"));
        list.add(new CarComparable("Kona", 2016, "Blue"));
        list.add(new CarComparable("Seltos", 2016, "Pink"));

        for(CarComparable e : list) {
            System.out.println("이름 : " + e.modelName);
            System.out.println("연식 : " + e.modelYear);
            System.out.println("색상 : " + e.color);
            System.out.println("-".repeat(20));
        }
    }
}
