public class FindTheIndexOfTheFirstOccuranceInAString {

    public static void main(String[] args) {

        int ans = strStr("Mississippi", "issip");
        System.out.println(ans);

    }

    public static int strStr(String haystack, String needle) {
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        int j = 0;
        int i = 0;
        int last = b.length - 1;

        while (i < a.length) {
            try {
                j = 0;
                if (b[j] == a[i] && b[last] == a[i + last]) {
                    while (j <= last && b[j] == a[i]) {
                        i++;
                        j++;
                    }

                    if (j - 1 == last)
                        return i - j;
                    else
                        i -= j;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                return -1;
            }
            i++;

        }

        return -1;
    }
}