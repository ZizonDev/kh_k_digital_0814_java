package stack연습;
// stack을 이용하여 괄호의 열림과 닫힘이 올바른지 체크하기.

import java.util.Scanner;
import java.util.Stack;

public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        for (int i = 0; i < exp.length(); i++) {            // 입력 받은 문자열의 길이만큼 반복 순회.
            char ch = exp.charAt(i);
            if (ch == '(') {st.push(ch);}                   // Auto Boxing 일어남. 기본 char형 ch가 참조타입 Character 안에 들어가기 위한 오토 박싱.
            else if (ch == ')') {
                if(!st.empty()) { st.pop(); }                 // 닫힘 괄호일 때 st가 비어있지 않다면 pop해 줌.
                else { System.out.println("괄호가 일치하지 않습니다.");
                        return;
                }
            }
        }
        if(st.isEmpty()) {System.out.println("괄호가 일치합니다.");}        // st가 비어있다면 모든 stack 과정이 무사히 끝난 것.
        else {System.out.println("괄호가 일치하지 않습니다.");}
    }
}
