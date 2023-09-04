package 스트림2;
// 반복자 스트림 : 내부 반복자 사용, 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당함. (즉, 반복이 끝나면 스트림이 전부 소모됨.)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StreamEx2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("민지", "해린", "다니엘", "혜인", "하니"));
        for(String e : list) System.out.print(e + " ");
        System.out.println();

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.print(name + " ");
        }
        System.out.println();

        list.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        list.forEach(e -> System.out.print(e + " "));               // 최종 연산.
    }
}
