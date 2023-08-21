package 다차원배열;
//2차원 배열 : 행에 대한 배열의 값은 실제 값이 존재하는 것이 아닌, 열에 대한 시작 주소를 갖고 있음.

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];        // 2*3 matrix, 0번 index에서 0, 1, 2 / 1번 index에서 0, 1, 2  존재하는 형태
        int k = 10;
        for (int i = 0; i < arr.length; i++) {              // 행에 대한 길이 (2)
            for (int j = 0; j < arr[i].length; j++) {       // 열에 대한 길이 (3)
                arr[i][j] = k;
                k += 10;
            }
        }
        for (int[] ints : arr) {
            for (int e : ints) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
