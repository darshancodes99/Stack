package Questions;

import java.util.Stack;

public class Check_palindrome_using_frame {
    public static void main(String[] args) {
        String s = "madam";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != stack.peek()) {
                System.out.println("not palindrome");
                return;
            }
            stack.pop();
        }
        System.out.println("palindrome");
    }
}
