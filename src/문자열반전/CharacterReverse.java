package 문자열반전;
// 문자열을 입력받음 : abcd -> cdba 로 출력

import java.util.Scanner;

public class CharacterReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int pos = input.length() - 1;               // 길이보다는 position이 필요한 것임. 반전시켜서 표현할 문자열의 시작 위치.
        while (pos > -1) {
            System.out.print(input.charAt(pos));
            pos--;
        }
    }
 }

//        Scanner sc2 = new Scanner(System.in);
//        String text = sc2.next();
//        int n = text.length();
//        for (int i = (n - 1); i >= 0; i--) {
//            System.out.print(text.charAt(i));
//            n--;                                        // n이 감소하면서 for문 반복!!!
//        }
//    }
//}
