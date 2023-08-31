package 집합;

import java.util.Arrays;
import java.util.HashSet;

public class SetClass {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        s1.addAll(s2);              // 합집합
        System.out.println("합집합 : " + s1);

        HashSet<Integer> s3 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s4 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        s3.retainAll(s4);           // 교집합
        System.out.println("교집합 : " + s3);

        HashSet<Integer> s5 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s6 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        s5.removeAll(s6);           // 차집합 [ s5 - s6 ]
        System.out.println("차집합 : " + s5);
    }
}
