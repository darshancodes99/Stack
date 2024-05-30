package Questions;

import java.util.Stack;

public class infix_to_postFix {
    public static void main(String[] args) {
        String s = "a*b/(d+c)*e";
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    str.append(stack.pop());
                }
                stack.pop(); // pop opening '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    str.append(stack.pop()); // pop lower operator
                }
                stack.push(c); // push higher operator
            }
        }

        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        System.out.println(str);
    }

    public static int precedence(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }
}
