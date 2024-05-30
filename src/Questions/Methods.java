package Questions;

public class Methods {
    public static int push(char[] stack, int top, char value) {
        if (top == stack.length - 1) {
            System.out.println("stack is full");
            return top;
        }
        //because top is -11;
        top++;
        stack[top] = value;
        return top;
    }

    public static void print(char[] stack, int top) {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    public static int pop(char stack[], int top) {
        if (top == -1) {
            System.out.println("stack is empty");
            return top;
        }
        System.out.print(stack[top]);
        top--;

        return top;
    }

    public static boolean isEmpty(int top) {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public static void peek(char[] stack, int top) {
        System.out.println(stack[top]);
    }

    public static void size(int top) {
        System.out.println(top + 1);
    }
}
