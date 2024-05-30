package Leetcode;

import java.util.Stack;

public class Q_2696 {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }

    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && ((s.charAt(i) == 'B' && stack.peek() == 'A') || (s.charAt(i) == 'D' && stack.peek() == 'C'))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.size();
    }
}
