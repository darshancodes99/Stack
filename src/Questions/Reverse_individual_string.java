package Questions;

public class Reverse_individual_string extends Methods {
    public static void main(String[] args) {
        String s = "how are you";
        char[] str = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                top = push(str, top, s.charAt(i));
            } else {
                while (!isEmpty(top)) {
                    top = pop(str, top);
                }
                System.out.print(" ");
            }
        }

        while (!isEmpty(top)) {
            top = pop(str, top);
        }

    }
}
