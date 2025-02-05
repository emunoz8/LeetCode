public class PowerOfThree {

    public static void main(String[] args) {
        test();

    }

    public static void test() {
        //check binary representtaion of all powers of 3
        for (int i = 0; i < 20; i++) {
            int num = (int) Math.pow(3, i);
            String binary = Integer.toBinaryString(num);
            System.out.println(binary + " : " + num);
        }

        int n = 216;
        System.out.println(216 / 3);

        //none of the binary nums have a value for 2^2 (4)
        //and all of the powers have num%3 == 0

    }

    //leetcode answer, the number 1162261467 represents the largest int of 3^n, where n =19(?)
    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    //recursive answer
    public static boolean recursiveIsPowerOfThree(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;

        if (n % 3 == 0)
            return isPowerOfThree(n / 3);
        else
            return false;
    }

}