package stack구조기본;
// Stack : LIFO(Last In First Out) 구조. 마지막에 들어온 값이 가장 먼저 빠져나감.

import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());       // 가장 위에 있는 값 출력함. // 3.
        System.out.println(stack.pop());        // 마지막에 들어온 값을 빼낸다. 3 빠져나옴. // 3.
        System.out.println(stack.empty());      // 현재 Stack이 비어있는지 여부를 반환. // false.
        System.out.println(stack.size());       // Stack 안에 몇 개의 데이터가 있는지를 확인.  // 2.
        System.out.println(stack.contains(1));  // () 안의 해당 값이 stack 안에 존재하는지 여부를 반환. // true.
    }
}
