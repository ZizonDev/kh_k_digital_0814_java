package list인터페이스;
// List Interface : ArrayList, LinkedList, Vector의 부모. interface로 구현되어 있음.
// List 구조는 배열과 유사함. 단, List는 배열과 달리 크기가 동적으로 변함.
// List 구조는 Queue와 달리 중간 insert, delete 가능. (Queue는 맨 뒤 삽입, 맨 앞 삭제 원툴.)
// ArrayList, LinkedList, Vector는 거의 동일한 메소드를 갖고 있어, 상호 간의 코드 변환이 자유로움.
// ArrayList : List Collections의 대표적인 자료 구조. (특별한 경우가 아니면 ArrayList 사용.)
// ArrayList는 검색이 빈번한 경우 효율적, 가장 마지막에 입력이 일어나는 경우에(맨 뒤에 붙일 때) 효과적. -> 선형구조
// LinkedList는 중간에 삽입, 삭제할 때 효율적이다. -> 비선형구조

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("100");                           // add(element) : List에 값을 추가함.
        list1.add("200");
        list1.add("300");
        list1.add(1, "150");          // add(index, element) : List의 index 위치에 값을 추가함.
        System.out.println(list1);
        System.out.println(list1.get(0));           // get(index) : List의 index 값에 해당하는 값을 가져옴.
        System.out.println(list1.size());           // size() : List의 크기를 가져옴.
        System.out.println(list1.contains("250"));  // contains(element) : List 안에 특정 값이 있는지 여부를 반환.
        System.out.println(list1.remove("100")); // remove(object) : List의 특정 객체를 삭제. 삭제 성공하면 true, 실패하면 false.
        System.out.println(list1.remove(2));  // remove(index) : List의 index 값을 삭제하고, 삭제된 값을 반환.
        System.out.println(list1);

        String[] arr = {"100", "200", "300"};                    // 배열을 ArrayList()의 괄호 안에 넣어 새로운 List를 만들 수 있다.
        List<String> list2 = new ArrayList<>(Arrays.asList(arr));   // Arrays.asList(배열) : 먼저 생성된 배열을 ArrayList에 추가.
        System.out.println(list2);

        String[] arr3 = {"10", "200", "100", "0", "9000"};
        List<String> list3 = new ArrayList<>(Arrays.asList(arr3));
        list3.sort(Comparator.reverseOrder());                      // sort(Comparator.reverseOrder()) : 내림차순 정렬
        System.out.println(list3);
        list3.sort(Comparator.naturalOrder());                      // sort(Comparator.naturalOrder()) : 오름차순 정렬
        System.out.println(list3);

        Comparator<String> nameComp = new Comparator<String>() {    // 오름,내림차순 말고 정렬 규칙을 정하고 싶을 때
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;                          // 글자의 길이 순으로 정렬하고 싶음.
                else if (o1.length() == o2.length()) return o1.compareTo(o2);     //글자 길이가 같으면 사전순으로 정렬하고 싶음.
                return -1;
            }
        };
        list3.sort(nameComp);
        System.out.println(list3);

        String[] arr4 = {"XYZXYZ", "Abcde", "bbc", "adf", "zzz"};
        List<String> list4 = new ArrayList<>(Arrays.asList(arr4));
        list4.sort(Comparator.reverseOrder());
        System.out.println(list4);
    }
}
