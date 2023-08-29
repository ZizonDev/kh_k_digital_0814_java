package 정렬오버라이딩;

import java.util.Arrays;
import java.util.Comparator;

// 글자 수 기준 오름차순으로 정렬하고, 길이가 같으면 사전 순으로 정렬해 보자.
public class ArraysSort {
    public static void main(String[] args) {
        String[] fruits = {"Kiwi", "Orange", "Apple", "Banana", "Melon", "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Arrays.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;        // 길이 순 정렬.
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);                // 사전 순 정렬. (o1이 더 크면 양수, o1이 더 작으면 음수, o1 == o2면 0 반환)
                    }
                    return -1;                                  // 현 상태를 유지해라.
                }
            }
        });
        System.out.println(Arrays.toString(fruits));
    }
}
