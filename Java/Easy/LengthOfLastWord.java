
public class LengthOfLastWord {
    public static void main(String[] args) {

        String sentence = "Hello World    ";

        int n = lengthOfLastWord(sentence);

        System.out.println(n);
    }

    public static int lengthOfLastWord(String s) {

        int len = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0) {
            if (s.charAt(i) != ' ')
                len++;
            else
                return len;
            i--;
        }

        return len;
    }
}
