package Questions;

public class Revere_string extends Methods {
    public static void main(String[] args) {
        String s = "hello";
        int top = -1;
        char[] string = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            top = push(string, top, s.charAt(i));
        }

        while (!isEmpty(top)) {
            top = pop(string, top);
        }
    }

}
