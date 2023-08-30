package split클래스;
// 문자열이 특정 문자열로 연결되어 있는 경우 구분자를 기준으로 문자열을 잘라서 새로 만들 때 사용한다.
// StringTokenizer() == split() -> 기능이 동일하다.

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        // "StringTokenizer"
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력하세요 : ");            // 이름을 띄어쓰기 없이 /로만 구분하여 입력받음.
        String names = sc.nextLine();
        StringTokenizer st = new StringTokenizer(names, "/");
        String[] nameStr = new String[st.countTokens()];           // countTokens() : 꺼내지 않고 남아 있는 토큰의 수.
        int index = 0;
        while (st.hasMoreTokens()) {                               // hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인.
            nameStr[index++] = st.nextToken();                     // nextToken() : 토큰을 하나씩 꺼냄.
        }
        for (String e : nameStr) System.out.print(e + " ");
        System.out.println();

        // "Split"
        Scanner sc2 = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력하세요 : ");
        String names2 = sc.nextLine();
        String[] nameStr2 = names2.split("/");
        for (String e : nameStr2) System.out.print(e + " ");
    }
}
