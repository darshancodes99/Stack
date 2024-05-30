package Questions;

import java.util.Arrays;

public class Implementation_of_two_stack {
    public static void main(String[] args) {
        int[] stack = new int[10];
        int top1 = -1;
        int top2 = stack.length;

        top1 = push1(stack, top1, 10);
        top1 = push1(stack, top1, 20);
        top1 = push1(stack, top1, 30);
        top1 = push1(stack, top1, 10);
        top1 = push1(stack, top1, 20);
        top1 = push1(stack, top1, 30);
        top1 = push1(stack, top1, 30);
        top2 = push2(stack, top2, 80, top1);
        top2 = push2(stack, top2, 90, top1);
        top2 = push2(stack, top2, 100, top1);

        System.out.println("Stack 1:");
        for (int i = 0; i <= top1; i++) {
            System.out.println(stack[i]);
        }

        // Print stack 2
        System.out.println("Stack 2:");
        for (int i = stack.length - 1; i >= top2; i--) {
            System.out.println(stack[i]);
        }

    }

    public static int push1(int[] stack, int top1, int value) {
        if (top1 == stack.length - 1) {
            System.out.println("stack is full");
            return top1;
        }
        //because top is -11;
        top1++;
        stack[top1] = value;
        return top1;
    }

    public static int push2(int[] stack, int top2, int value, int top1) {
        if (top2 == top1 + 1) {
            System.out.println("stack is full");
            return top2;
        }

        top2--;
        stack[top2] = value;
        return top2;
    }

    public static int pop1(int[] stack, int top1) {
        if (top1 == -1) {
            System.out.println("stack is empty");
            return top1;
        }
        System.out.println(stack[top1]);
        top1--;

        return top1;
    }

    public static int pop2(int[] stack, int top2) {
        if (top2 == stack.length) {
            System.out.println("stack is empty");
            return top2;
        }
        System.out.println(stack[top2]);
        top2++;

        return top2;
    }

    public static int peek1(int stack, int top1) {
        return top1;
    }

    public static int peek2(int stack, int top2) {
        return top2;
    }


}
