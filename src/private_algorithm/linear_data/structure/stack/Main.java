package private_algorithm.linear_data.structure.stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        // stack에 데이터를 푸시
        stack.push(1);
        System.out.println("stack에 1 push");
        stack.push(2);
        System.out.println("stack에 2 push");

        // 스택이 비었는지 확인
        System.out.println("stack is isEmpty :" + stack.isEmpty());

        // 스택에서 팝
        System.out.println("pop :" + stack.pop());
        System.out.println("pop :" + stack.pop());
        System.out.println("stack is isEmpty :" + stack.isEmpty());

        // 스택에 가장 최근에 푸시한 값(peek)
        stack.push(3);
        System.out.println("first peek : " + stack.peek());
        System.out.println("second peek : " + stack.peek());
        System.out.println("now stack size is " + stack.size());
        System.out.println("pop :" + stack.pop());
        System.out.println("now stack size is " + stack.size());
    }
}
