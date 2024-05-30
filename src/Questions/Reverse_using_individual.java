package Questions;

import java.util.Stack;

public class Reverse_using_individual {
    public static void main(String[] args) {
        String s = "how are you";
        Stack<Character> stack =new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' '){
                stack.push(s.charAt(i));
            } else {
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
