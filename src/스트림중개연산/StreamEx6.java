package 스트림중개연산;
// 초기에 생성된 stream은 중간 연산을 통해 또 다른 stream으로 변환됨.

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main(String[] args) {
        // [필터링] filter() : 주어진 조건에 맞는 요소만으로 구성된 stream 생성, distinct() : 중복된 요소를 제거한 stream 생성.
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 3, 7, 6, 2, 1, 4);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 3, 7, 6, 2, 1, 4);     // stream은 한번 사용하면 없어짐. 목적 당 각각 하나씩 만들어야 됨.
        stream1.distinct().forEach(e -> System.out.print(e + " "));                 // 중복 값 제거.
        System.out.println();
        stream2.filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));    // 홀수라는 조건 부여.
        System.out.println();

        // [스트림 변환] map() : 해당 스트림 요소들을 함수의 인수로 전달하여 그 반환값으로 이루어진 stream 생성
        Stream<String> stream3 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT", "PYTHON");
        stream3.map(String::length).forEach(e -> System.out.print(e + " "));         // 4 3 4 10 6이 반환됨.
        System.out.println();
        // [스트림 변환] flatMap() : 각 요소를 변환하여 중첩된 스트림을 평면화한 후 하나의 새로운 stream으로 생성.
        Stream<String> stream4 = Stream.of("I am hungry", "pizza", "chicken");
        stream4.flatMap(e -> Stream.of(e.split(""))).forEach(System.out::print);
        System.out.println();

        // [제한] skip() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소로 이루어진 stream 생성.
        IntStream stream5 = IntStream.range(0, 10);                        // range(0, 10) : 0 초과 10 미만 -> 1,2,3,4,5,6,7,8,9
        stream5.skip(4).forEach(e -> System.out.print(e + " "));        // skip(4) : index 0,1,2,3 4개를 제외한 나머지 요소로 new stream 생성. -> 4,5,6,7,8,9
        System.out.println();
        // [제한] limit() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소로 이루어진 새로운 stream 생성.
        IntStream stream6 = IntStream.range(0, 10);
        stream6.limit(5).forEach(e -> System.out.print(e + " "));   // limit(5) : maxSize를 5로 제한. -> 0,1,2,3,4
        System.out.println();
        IntStream stream7 = IntStream.range(0, 10);
        stream7.skip(3).limit(5).forEach(e -> System.out.print(e + " "));   // -> 3,4,5,6,7
        System.out.println();

        // [정렬] sorted() : 해당 스트림을 주어진 비교연산자(comparator)를 이용하여 정렬.
        Stream<String> stream8 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream9 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        stream8.sorted().forEach(s -> System.out.print(s + " "));           // 길이 기준 오름차순 정렬
        System.out.println();
        stream9.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));  // 길이 기준 내림차순 정렬
    }
}
