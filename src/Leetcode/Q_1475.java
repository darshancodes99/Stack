package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Q_1475 {
    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                prices[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(prices));
    }
}
