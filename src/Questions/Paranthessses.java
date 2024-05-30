package Questions;

import java.util.Stack;

public class Paranthessses {
    public static void main(String[] args) {
        String s = "(){()}()";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    System.out.println(false);
                    return;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')){
                    System.out.println(false);
                    return;
                }
            }
        }

        if (stack.isEmpty()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
