package 로또번호만들기;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/*
    중복 없는 로또 번호 만들기
    1 ~ 45 사이의 임의의 정수 6개 생성. 단, 중복 제외!
    6개 값을 갖는 배열 하나 만들기 (Math.random() -> 0.1 ~ 0.99)
    int val = (int) {Math.random() * 45 + 1};
    생성된 val 값을 배열에 저장할 때 배열 내에 해당하는 값이 있는지 확인.
    반복횟수는 정할 수 없음 -> while(true) 형태로 무한반복 써야 함. + 탈출 조건 필요. (중복되지 않는 숫자 6개가 저장되면 break)
 */
public class LottoNumber {
    // [sol 3] Set 이용하여 풀기 (Set : java에서 사용하는 집합 개념, 집합 자체가 중복되는 원소는 없앰.)
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tmp = (int)( Math.random() * 45 ) + 1;
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}



    // [sol 2] 배열 없이 ArrayList 사용하여 풀기
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();         // ArrayList는 동적 할당이 됨.
//        int tmp;
//        while (true) {
//            tmp = (int)( Math.random() * 45 ) + 1;
//            if(!list.contains(tmp)) {
//                list.add(tmp);
//            }
//            if (list.size() == 6) break;
//        }
//        System.out.println(list);
//    }
//}



    // [sol 1] 배열 쓰고 풀기
//    public static void main(String[] args) {
//        int[] lotto = new int[6];
//        int tmp, index = 0;                    // 임시 로또 번호
//        boolean isExist = false;               // 중복 값 존재하냐? 디폴트는 false.
//
//        while (true) {
//            tmp = (int) (Math.random() * 45) + 1;
//            for (int i = 0; i < lotto.length; i++) {
//                if (lotto[i] == tmp) isExist = true;
//            }
//            if (!isExist) lotto[index++] = tmp;
//            if (index == 6) break;
//            isExist = false;
//        }
//        for (int e : lotto) System.out.print(e + " ");
//    }
//}



//        int[] arr = new int[6];
//        while(true) {
//            int val1 = (int) Math.random() * 45 + 1;
//            int val2 = (int) Math.random() * 45 + 1;
//            if (val1 != val2) {arr[0] = val1; arr[1] = val2;} break;
//        }
//        System.out.println(arr + " ");
//    }
//}
