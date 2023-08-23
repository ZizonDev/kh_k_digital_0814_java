package whyKMP;

import java.util.Scanner;

/*
    [문제]
    사람들은 이렇게 사람 성이 들어간 알고리즘을 두 가지 형태로 부른다.
    - 첫 번째는 성을 모두 쓰고, 이를 하이픈(-)으로 이어 붙인 것이다. 예를 들면, Knuth-Morris-Pratt이다. 이것을 긴 형태라고 부른다.
    - 두 번째로 짧은 형태는 만든 사람의 성의 첫 글자만 따서 부르는 것이다. 예를 들면, KMP이다.
    긴 형태의 알고리즘 이름이 주어졌을 때, 이를 짧은 형태로 바꾸어 출력하는 프로그램을 작성하시오.

    [입력]
    입력은 한 줄로 이루어져 있고, 최대 100글자의 영어 알파벳 대문자, 소문자, 그리고 하이픈 ('-', 아스키코드 45)로만 이루어져 있다.
    첫 번째 글자는 항상 대문자이다. 그리고, 하이픈 뒤에는 반드시 대문자이다. 그 외의 모든 문자는 모두 소문자이다.

    [출력]
    첫 줄에 짧은 형태 이름을 출력한다.

    [Hint]
    1. split("")를 이용해서 문자열을 자르고 자른 문자열의 0번째 index를 선택하는 방법
    2. 무조건 0번째 선택하고, 하이픈(-) 다음의 문자 선택하는 방법
    3. 대문자만 골라내는 방법 (charAt(index), toCharArray()이용)
 */
public class WhyKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        //sol 1. charAt(index)
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') System.out.print(name.charAt(i));
        }

        //sol 2. index 0 무조건 선택하고 "-" 다음의 문자 선택
        for (int j = 0; j < name.length(); j++) {
            if (j == 0) System.out.print(name.charAt(j));
            else {
                if (name.charAt(j) == '-') System.out.print(name.charAt(j + 1));
            }
        }

        //sol 3. split 이용
        String[] splitName = name.split("-");                   // 정규식이 포함되었음. (regular expression)
        for (String e : splitName) System.out.print(e.charAt(0));     // StringName이라는 분리된 배열의 첫번째만 e로 출력하겠다.


        //sol 4. toCharArray() : 문자열을 문자들의 배열로 변경
        char[] chName = name.toCharArray();                           // name이라는 문자열을 문자들의 배열로 변환.
        for (char ch : chName) {
            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
        }
    }

}
