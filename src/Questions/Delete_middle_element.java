package Questions;

import java.util.Stack;

public class Delete_middle_element {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        int mid = stack1.size() / 2;

        // add after mid elements in stack2 and delete from stack1
        while (mid > 0) {
            stack2.push(stack1.peek());
            stack1.pop();
            mid--;
        }

        // delete mid elements from stack1
        stack1.pop();

        // after pop mid add element from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.peek());
            stack2.pop();
        }

        System.out.println(stack1);
    }
}
