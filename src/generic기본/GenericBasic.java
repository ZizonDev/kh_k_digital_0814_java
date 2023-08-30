package generic기본;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");                      // "hello"라는 문자열을 데이터 타입이 정해지지 않은 list에 일단 넣음.
        String str = (String) list.get(0);      // list의 0번째 값을 String 타입으로 바꾸어주는 과정 필요함.
        System.out.println(str);

        List<String> list2 = new ArrayList<>(); // List에 generic 적용. <String> 이라는 타입변수를 명시함으로써 입력받을 때 스트링 타입만 받게 됨. 스트링이 아니면 에러를 잡아 줌.
        list2.add("java");                      // 13행의 List는 추상클래스로서 ArrayList가 상속받는 개념임.
        System.out.println(list2);
        String str2 = list2.get(0);             // 형 변환을 안해줘도 된다는 장점!
        System.out.println(str2);
    }
}
