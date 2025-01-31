public class ValidAnagram {

    public static void main(String[] args) {
        //System.out.println((int) 'z' - (int) 'a');

        System.out.println(isAnagram("anagra", "nagaram"));

    }

    public static boolean isAnagram(String s, String t) {
        int[] letters;
        int start = (int) 'a';
        int end = (int) 'z';
        letters = new int[end - start + 1];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - start]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - start;

            letters[index]--;

            if (letters[index] < 0)
                return false;
        }

        for (int i = 0; i < letters.length; i++)
            if (letters[i] != 0)
                return false;

        return true;
    }
}