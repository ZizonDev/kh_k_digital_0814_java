package 스트림최종연산;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamEx7 {
    public static void main(String[] args) {
        // [요소의 소모] reduce()
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "+" + s2);       // reduce() : 1. 넷 + 둘 -> 2. (넷+둘) + 셋 -> 3. (넷 + 둘 + 셋) + 하나
        result1.ifPresent(e -> System.out.print(e + " "));                          // Optional : null을 방지하는 문법 포함됨. ifPresent : NullPointedException이 없으면 찍어라. 즉 값이 있을 때만 연산함.
        System.out.println();
        String result2 = stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2); // just 문자열로 받아서 stream2의 끝까지 돈다. 이 때 "시작"과 같은 초기값을 설정해야 한다.
        System.out.print(result2);
    }
}
