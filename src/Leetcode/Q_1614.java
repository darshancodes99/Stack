package Leetcode;

import java.util.Stack;

public class Q_1614 {
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        Stack<Character> stack = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }
            max = Math.max(max, stack.size());
        }
        System.out.println(max);
    }
}
