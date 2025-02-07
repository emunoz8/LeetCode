public class RansomNote {

    public static void main(String[] args) {
        System.out.println('z' - 'a' + 1);
    }

    //not optimal, but it works... very similar to LeetCode answer(didn't get it from there)
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int['z' - 'a' + 1];

        for (int i = 0; i < magazine.length(); i++)
            letters[magazine.charAt(i) - 'a']++;

        for (int i = 0; i < ransomNote.length(); i++) {

            if (--letters[ransomNote.charAt(i) - 'a'] < 0)
                return false;

        }

        return true;
    }

}