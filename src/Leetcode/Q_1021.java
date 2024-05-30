package Leetcode;

import java.util.Stack;

public class Q_1021 {
    public static void main(String[] args) {
        String s = "(()())(())";
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (!stack.isEmpty()) {
                    str.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    str.append(s.charAt(i));
                }
            }
        }

        System.out.println(str.toString());
    }
}
