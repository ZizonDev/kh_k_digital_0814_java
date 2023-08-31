package 해시함수만들기;
// Hash Map의 구조 (Key, Value)
// Map : Key로 Value에 접근함. Value의 순서가 없음.
// Key : 임의의 문자열이나 숫자가 올 수 있음. 중복값은 존재할 수 없다.
// Hash : 고유의 Key를 갖고 Hash Function에 진입. -> Hash Function 내부에서 임의의 Key가 배열로 정리된 값의 index로 변환됨. (O(1))
// Hash Collision : 한 배열에 여러 값이 들어오는 ... 해쉬 충돌. 해결하기 위해 한 층의 값들을 체인 형태로 링크함.

import java.util.Scanner;

public class HashFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String in = sc.next();
        int sum = 0;
        for (int i = 0; i < in.length(); i++) {
            sum += in.charAt(i);                // 문자열 String에서 각 char의 아스키코드값을 더해줌.
        }
        System.out.println("배열의 인덱스 : " + (sum % 100));
    }
}
