package 배열의복사;

import java.util.Arrays;

// java의 배열은 한 번 선언하면 크기를 변경할 수 없음. (동적 할당 x)
// 배열의 크기를 변경하기 위해서는 더 큰 배열을 만들고, 기존의 배열을 복사하여 새로운 배열에 옮겨야 한다.
// arraycopy() : System.arraycopy(source, sourcePosition, destination, destinationPosition, length);
// copyOf() : Arrays.copyOf(source, length);
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
//        int newLength = 10;
//        int[] arr2 = new int[newLength];
//        System.arraycopy(arr1, 0, arr2, 4, arr1.length);        // destPos : arr1을 복붙할 위치.
//        for(int e : arr2) {System.out.print(e + " ");}

        int[] arr3 = Arrays.copyOf(arr1, 10);
        for(int e : arr3) {System.out.print(e + " ");}
    }
}
