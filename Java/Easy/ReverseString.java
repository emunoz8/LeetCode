public class ReverseString {

    public static void main(String[] args) {
        char[] letters = { 'R', 'a', 'f', 'a', 'e', 'l' };

        reverseString(letters);

        for (char n : letters) {
            System.out.print(n);
        }

        // for (int i = 0; i < letters.length; i++) {

        // }

    }

    public static void reverseString(char[] s) {
        char left;
        char right;

        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            left = s[i];
            right = s[j];

            s[i] = right;
            s[j] = left;

        }

    }

}