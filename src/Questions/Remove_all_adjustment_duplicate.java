package Questions;

import java.util.Stack;

public class Remove_all_adjustment_duplicate {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        System.out.println(stack);
    }
}
