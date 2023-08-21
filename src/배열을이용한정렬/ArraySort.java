package 배열을이용한정렬;
// 1차원 배열을 이용한 기본 정렬 (버블 정렬 / 삽입 정렬)
// Notion의 버블 정렬 예시는 일반적인 방법과 약간의 차이가 있음.
// 기본적인 버블 정렬 / 삽입 정렬은 시간의 복잡도를 나타내는 빅 O 표기법으로 표시하면  O(N^2).
public class ArraySort {
    public static void main(String[] args) {
        // 버블 정렬 (오름차순 정렬하기)
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6, 2, 1};
        int tmp = 0;                                 // 정렬을 위한 임시 공간.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {              // i=0, j=0인 경우 arr[0] = 9 == arr[0] = 9 -> i=0, j=1인 경우 9 > 4 -> tmp = 4 -> arr{4, 9, ...} => {1,
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for (int e : arr) System.out.print(e + " ");
    }
}
