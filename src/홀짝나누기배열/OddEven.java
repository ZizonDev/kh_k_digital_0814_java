package 홀짝나누기배열;

import java.util.Scanner;

public class OddEven {
    int[] nums = new int[7];
    int[] odd = new int[7];
    int[] even = new int[7];
    int evenIndex = 0;
    int oddIndex = 0;
    int fixedOddIndex;

    public void InputNum() {
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if (i == 7) return;
        }
    }
    public void OddOrEven() {
        for (int e : nums) {
            if (e % 2 == 0) even[evenIndex++] = e;
            else odd[oddIndex++] = e;
        }
//        fixedOddIndex = 7 - evenIndex;
    }
    public void PrintNum() {
        System.out.print("홀수 : ");
        for(int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
    }
}
