public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));

    }

    //first attempt, with exception of j = letters.length (-1) - off by one error
    public static String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        boolean[] isVowel = new boolean[letters.length];
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        char temp;

        for (int i = 0; i < letters.length; i++)
            for (int j = 0; j < vowels.length; j++)
                if (letters[i] == vowels[j]) {
                    isVowel[i] = true;
                    break;
                }

        for (int i = 0, j = letters.length - 1; i < j; i++, j--) {

            while (i < j && !isVowel[i])
                i++;
            while (i < j && !isVowel[j])
                j--;

            if (i >= j)
                break;

            temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;

        }

        return new String(letters);

    }

}