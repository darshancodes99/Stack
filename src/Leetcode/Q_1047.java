package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Q_1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        System.out.println(stack);
    }
}
