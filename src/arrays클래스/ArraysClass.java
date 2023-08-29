package arrays클래스;
// Arrays class : 배열을 다루기 위한 다양한 메소드가 포함되어 있음.

import java.util.Arrays;
import java.util.Collections;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 4, 7, 8, 1, 9, 2, 6};
        Arrays.sort(arr1);                              // 오름차순 정렬. (병합 정렬이 가미된 quick sort 사용. bubble sort와는 다름.)
        for(int e : arr1) System.out.print(e + " ");

        System.out.println();

        Integer[] arr2 = {2, 9, 3, 8, 1, 4, 7, 5, 6};
        Arrays.sort(arr2, Collections.reverseOrder());  // 내림차순 정렬. Collections 타입은 기본형 int를 인식하지 않는다.
        for(int e : arr2) System.out.print(e + " ");
    }
}
