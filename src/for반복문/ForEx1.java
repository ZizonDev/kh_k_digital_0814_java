package for반복문;
// for (초기화식; 조건식; 증감식) {참인 동안 수행되는 구문}
// 주로 정해진 횟수를 반복하는 경우에 사용합니다.

public class ForEx1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.printf("%4d", i);                // printf는 서식. "%4d"는 오른쪽으로 4칸 밀겠다.
            if(i % 10 == 0) System.out.println();       // 10의 배수일 때마다 줄을 바꾸겠다.
        }

//        int i = 1;
//        while(true) {
//            System.out.printf("%4d", i);
//            if (i % 10 == 0) System.out.println();
//            i++;
//            if(i >100) break;                         // for문과 while문의 결과값 동일.
//        }

//        int i = 1;
//        for(;;) {                                       // for문 안의 세 가지 조건을 다 괄호 밖으로 빼도 결과는 동일함.
//            System.out.printf("%4d", i);
//            if(i % 10 == 0) System.out.println();
//            i++;
//            if(i > 100) break;
//        }

    }
}
