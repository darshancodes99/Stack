package Questions;

import java.util.Stack;

public class Stack_methods_using_framework {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    }
}
