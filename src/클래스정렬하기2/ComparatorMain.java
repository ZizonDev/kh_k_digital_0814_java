package 클래스정렬하기2;
// Comparator : 두 개의 메소드를 비교하는 방법.
// 아까 Comparable은 자기 자신과 매개변수로 들어온 CarComparable을 비교했다면
// Comparator는 두 개의 클래스를 비교하는 셈.

import java.util.TreeSet;

public class ComparatorMain {
    public static void main(String[] args) {
        TreeSet<FruitComparator> set = new TreeSet<>(new DescendingComparator().reversed());
        set.add(new FruitComparator("포도", 3000));
        set.add(new FruitComparator("수박", 10000));
        set.add(new FruitComparator("딸기", 7000));
        for (FruitComparator e : set) {
            System.out.println("과일 이름 : " + e.name + ", 과일 가격 : " + e.price);
        }
    }
}
