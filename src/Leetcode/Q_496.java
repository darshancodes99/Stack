package Leetcode;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class Q_496 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();

        int[] nextGreater = new int[10001];
        Arrays.fill(nextGreater, -1);

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                int smallerNum = stack.pop();
                nextGreater[smallerNum] = num;
            }
            stack.push(num);
        }

        // Populate the result array with the next greater elements
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater[nums1[i]];
        }

        System.out.println(Arrays.toString(result));

    }
}
