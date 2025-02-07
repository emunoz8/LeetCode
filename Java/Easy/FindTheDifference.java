public class FindTheDifference {

    public static void main(String[] args) {

    }

    //LeetCode answer, very cool.
    public static char optimalFindTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for (char s1 : s.toCharArray()) {
            sum1 += s1;
        }
        for (char t1 : t.toCharArray()) {
            sum2 += t1;
        }
        return (char) (sum2 - sum1);
    }

    //first attempt, not optimal
    public char findTheDifference(String s, String t) {
        int[] letters = new int['z' - 'a' + 1];

        for (int i = 0; i < t.length(); i++)
            letters[t.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++)
            letters[s.charAt(i) - 'a']--;

        for (int i = 0; i < letters.length; i++)
            if (letters[i] == 1)
                return (char) (i + 'a');

        return '!';//given problem will never get to this statement
    }

}