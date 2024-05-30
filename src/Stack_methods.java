public class Stack_methods {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
        top = push(stack, top, 10);
        top = push(stack, top, 20);
        top = push(stack, top, 30);
        top = push(stack, top, 40);
        top = push(stack, top, 50);
        top =pop(stack,top);

        print(stack, top);
        System.out.println("peek :");
        peek(stack, top);
        System.out.println("size :");
        if (!isEmpty(top)) {
            size(top);
        }

        System.out.println("after pop");
        top = pop(stack, top);
        top = pop(stack, top);
        top = pop(stack, top);
        top = pop(stack, top);

    }

    private static int push(int[] stack, int top, int value) {
        if (top == stack.length - 1) {
            System.out.println("stack is full");
            return top;
        }
        //because top is -11;
        top++;
        stack[top] = value;
        return top;
    }

    private static void print(int[] stack, int top) {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i] + " ");
        }
    }

    private static int pop(int stack[], int top) {
        if (top == -1) {
            System.out.println("stack is empty");
            return top;
        }
        System.out.println(stack[top] + " is popped");
        top--;

        return top;
    }

    private static boolean isEmpty(int top) {
        if (top == -1) {
            return true;
        }
        return false;
    }

    private static void peek(int[] stack, int top) {
        System.out.println(stack[top]);
    }

    private static void size(int top) {
        System.out.println(top + 1);
    }
}
