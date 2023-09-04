package 스트림1;
// stream : 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위해 사용.
// 특징 1 : 자료의 대상과 관계없이 동일한 연산을 수행.
// 특징 2 : 내부 반복자 사용. (반복문을 배제하기 위함.)
// 특징 3 : 원본 데이터를 변경하지 않음.
// 특징 4 : 지연(lazy) 연산, 병렬 처리 지원. -> 성능 향상.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // stream 생성(일회성).중간연산.최종연산;                    // stream에서 중간 연산은 filter, map 등 여러 개가 올 수 있지만 최종 연산은 only One.
        list.stream().filter(s -> s >= 5).forEach(e -> System.out.print(e + " "));     // arr 내의 정수들을 s라는 매개변수를 통해 받아서 '5보다 크거나 같을 경우'라는 filter를 걸어줌.
        // if 최종연산 부분을 변형 없이 e -> System.out.println(e) 로 한다면, e를 사용하지 않고 메소드 참조를 이용하여 System.out::println 을 쓸 수 있다.
        System.out.println();
        int sumValue = list.stream().mapToInt(e -> e).sum();        // mapToInt() : e값을 그대로 입력받고 int stream으로 변환해 줌.
        System.out.print("합계 : " + sumValue);
        int sumValue2 = list.stream().reduce(0, (e1, e2) -> e1 + e2);   // reduce : index 0부터 시작. index 0과 1 연산 -> new 값과 index 2 연산 -> 또 다른 new 값과 index 3 연산...
        System.out.print("누적 합계 : " + sumValue2);                            // reduce 안의 수행문은 reduce(0, Integer::sum) 으로 변환 가능.
        int count = (int) list.stream().count();                    // (int) list.stream.count() 대신 list.size()를 쓸 수 있다.
        System.out.print("횟수 : " + count);
    }
}
