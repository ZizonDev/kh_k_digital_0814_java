package 대소문자바꾸기;
/*
    [문제]
    영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
    [입력]
    첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
    [출력]
    첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
    [Hint]
    대문자 A = 65
    소문자 a = 97
    charAt(index) : 문자열의 index 문자를 추출.
    toCharArray() : 문자열을 문자의 배열로 전환.
 */

import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영어를 입력하세요. (대소문자 구분) : ");
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch > 'A' && ch < 'a')  System.out.print ( (char)(ch +('a'-'A')) );
            else System.out.print ( (char) (ch - ('a' - 'A')) );
        }
    }
}
