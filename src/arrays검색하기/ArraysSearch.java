package arrays검색하기;
// 검색을 하기 위해서는 사전에 정렬이 되어 있어야 한다.
// 이분 검색 : 중위값 기준 key가 왼쪽이냐 오른쪽이냐? 또 그 다음 구간의 중위값 기준 key가 왼쪽이냐 오른쪽이냐? ... 정확한 key 값을 찾을 때까지 반복.

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 입력 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("찾고자 하는 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * num) + 1;        // num이 100이면 1~100의 정수를 배열에 랜덤하게 담는 것. 중복도 포함한다.
        }
        Arrays.sort(arr);
        for(int val : arr) System.out.print(val + " ");
        System.out.println();
        int result = Arrays.binarySearch(arr, key);                // 정렬된 배열 arr을 이분 검색함.
        if (result >= 0) {
            System.out.println("찾는 값의 index : " + result);       // 랜덤 배열 중 key가 위치한 index값을 반환해준다.
        } else {
            System.out.println("찾는 값이 존재하지 않습니다.");         // 이 때 result = - ( 배열크기 + 1 )
        }
    }
}
