public class IsSubsequence {
    public static void main(String[] args) {

    }

    public static boolean IsSubsequence(String s, String t) {
        int len = s.length();

        if (len == 0)
            return true;
        int count = 0;

        for (char letter : t.toCharArray()) {
            if (count < len && letter == s.charAt(count))
                count++;
        }

        return count == s.length();

    }

}