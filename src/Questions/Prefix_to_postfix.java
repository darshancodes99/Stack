package Questions;

import java.util.Stack;

public class Prefix_to_postfix {
    public static void main(String[] args) {
        String s = "*+ab-cd";
        Stack<String> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--){
            if (isOperator(s.charAt(i))){
                String right = stack.pop();
                String left = stack.pop();
                String newStr = right + left + s.charAt(i);
                stack.push(newStr);
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());

    }
    public static boolean isOperator(char c){
        if (c == '+' || c == '-' || c == '*' || c == '/' ){
            return true;
        }
        return false;
    }
}
