public class Test_2 {
    public static void main(String[] args) {
        // reverse alternate
        String s = "how are you im fine";
        int count = 0;
        char[] chars = s.toCharArray();
        int left = 0;

        for (int i = 0; i < chars.length; i++) {
            int current = left;
            int right = 0;
            if (chars[i] == ' ') {
                right = i - 1;
                left = i + 1;
            } else if (i == chars.length - 1) {
                right = i;
            }

            if (chars[i] == ' ' || i == chars.length - 1) {
                if (count % 2 == 0) {
                    reverse(chars, current, right);
                }
                count++;
            }
        }

        s = new String(chars);
        System.out.println(s);
    }

    public static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
