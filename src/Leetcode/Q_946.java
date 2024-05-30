package Leetcode;

import java.util.Stack;

public class Q_946 {
    public static void main(String[] args) {
        int[] pushed = {0, 2, 1};
        int[] popped = {0, 1, 2};
        System.out.println(validateStackSequences(pushed,popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int index = 0;

        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }

        return stack.isEmpty();


//     optimised solution
//        int i = 0;
//        int j = 0;
//
//        for (int number : pushed) {
//            pushed[i] = number;
//            i++;
//            while (i > 0 && pushed[i-1] == popped[j]) {
//                i--;
//                j++;
//            }
//        }
//
//        return i == 0;

    }
}
