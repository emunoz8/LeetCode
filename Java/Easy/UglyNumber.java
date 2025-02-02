public class UglyNumber {

    public static void main(String[] args) {

    }

    //LeetCode answer. Divide by 2 until you cant, divede by 3 until you cant, finally divide by 5 until you cant
    //check if n == 1, if false then is not ugly number.
    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;

        while (n % 2 == 0)
            n /= 2;

        while (n % 3 == 0)
            n /= 3;

        while (n % 5 == 0)
            n /= 5;

        return n == 1;

    }

}