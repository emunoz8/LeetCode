package LongestCommonPrefix;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));

    }

    public static String longestCommonPrefix(String[] strs) {
        String a = strs[0];
        String b;
        int n = a.length();
        int j;

        for (int i = 1; i < strs.length && n > 0; i++) {
            b = strs[i];
            j = 0;
            while (j < n && j < b.length() && a.charAt(j) == b.charAt(j))
                j++;

            a = strs[i].substring(0, j);
            n = j;
        }

        return a;
    }
}
