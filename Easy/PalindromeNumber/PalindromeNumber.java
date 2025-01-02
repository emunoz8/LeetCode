package PalindromeNumber;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(112211));

    }

    public static boolean isPalindrome(int x) {

        String num = Integer.toString(x);

        int i = 0, j = num.length() - 1;

        while (i < j) {
            if (num.charAt(i) != num.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

}
