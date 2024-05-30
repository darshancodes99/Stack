package Questions;

import java.util.Stack;

public class Reverse_using_frame {
    public static void main(String[] args) {
        String s = "hello";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }


    }
}
