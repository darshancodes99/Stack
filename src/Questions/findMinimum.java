package Questions;

import java.util.Objects;
import java.util.Stack;

public class findMinimum {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        pushValue(stack, minStack, 60);
        pushValue(stack, minStack, 20);
        pushValue(stack, minStack, 10);
        pushValue(stack, minStack, 20);
        pushValue(stack, minStack, 50);
        pushValue(stack, minStack, 5);
        pushValue(stack, minStack, 9);

        popValue(stack, minStack);
        popValue(stack, minStack);
        popValue(stack, minStack);

        getMin(minStack);
    }

    public static void pushValue(Stack<Integer> stack, Stack<Integer> minStack, int value) {
        stack.push(value);
        if (minStack.isEmpty()) {
            minStack.push(stack.peek());
        }
        if (stack.peek() <= minStack.peek() && !minStack.isEmpty()) {
            minStack.push(value);
        }
    }

    public static void popValue(Stack<Integer> stack, Stack<Integer> minStack) {
        if (stack.peek() == minStack.peek()) {
            minStack.pop();
            stack.pop();
        } else {
            stack.pop();
        }
    }

    public static void getMin(Stack<Integer> minStack) {
        System.out.println(minStack.peek());
    }
}
