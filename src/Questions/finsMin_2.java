package Questions;

import java.util.Stack;

public class finsMin_2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int min = Integer.MAX_VALUE;

        min = push(stack, 6, min);
        min = push(stack, 10, min);
        min = push(stack, 7, min);
        min = push(stack, 10, min);
        min = push(stack, 10, min);
        min = push(stack, 5, min);
        min = push(stack, 10, min);
        min = push(stack, 2, min);

        min = pop(stack, min);
        min = pop(stack, min);
        min = pop(stack, min);

        System.out.println(getMin(stack, min));

    }

    public static int push(Stack<Integer> stack, int value, int min) {
        if (value <= min) {
            stack.push(min);
            min = value;
        }
        stack.push(value);
        return min;
    }

    public static int pop(Stack<Integer> stack, int min) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return min;
        }
        int popped = stack.pop();
        if (popped == min) {
            if (stack.isEmpty()) {
                min = Integer.MAX_VALUE;
            } else {
                min = stack.pop();
            }
        }
        return min;
    }

    public static int getMin(Stack<Integer> stack, int min) {
        if (stack.isEmpty()) {
            System.out.println("stack is empty");
        }
        return min;
    }


}
