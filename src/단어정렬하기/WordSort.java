package 단어정렬하기;
// 먼저 몇 개의 단어를 입력받을지 정수 N을 입력받는다.
// 알파벳 소문자로 이루어진 N개의 단어가 입력되면 아래의 조건에 따라 정렬하는 프로그램 만들기.
// 조건 1. 길이가 짧은 것부터 정렬.
// 조건 2. 길이가 같으면 사전 순으로 정렬.
// 조건 3. 중복값은 제거.

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        String[] word = new String[n];
        System.out.print("단어를 입력하세요 : ");
        for(int i = 0; i < n; i++) {
            word[i] = sc.next();
        }
        HashSet<String> set = new HashSet<>(Arrays.asList(word));       // 중복값이 set에 들어가면서 없어짐.
        word = set.toArray(new String[0]);          // 글자 수를 비교하기 위해 set을 다시 배열로 되돌림.

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);    // 길이가 같으면 사전 순 정렬.
                else return o1.length() - o2.length();                  // o1의 길이가 길면 o1길이 - o2길이가 양수이므로 뒤집어라.
            }
        });
        System.out.println(Arrays.toString(word));
    }
}
