package 클래스정렬하기2;

import java.util.Comparator;

public class DescendingComparator implements Comparator<FruitComparator> {

    @Override
    public int compare(FruitComparator o1, FruitComparator o2) {
        if(o1.price < o2.price) return 1;               // 가격 기준 내림차순 정렬.
        else if (o1.price == o2.price) return 0;
        else return -1;
    }

    @Override
    public Comparator<FruitComparator> reversed() {     // 내가 만들어준 걸 다시 뒤집어 정렬. (= 가격 기준 오름차순 됐음.)
        return Comparator.super.reversed();
    }
}
