package Questions;

import java.util.Stack;

public class Check_palindrome extends Methods {

    public static void main(String[] args) {
        String s = "madam";
        char[] str = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            top = push(str, top, s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (str[top] != s.charAt(i)) {
                System.out.println(" not palindrome");
                return;
            }
            top = pop(str, top);
        }
        System.out.println(" palindrome");


        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Stack<Integer> stack = new Stack<>();
        stack.push(height[0]);
        for(int i = 1; i < height.length; i++){
            if (stack.peek() < height[i]){
                stack.push(height[i]);
            }
        }

        int sum = 0;

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);



    }
}
