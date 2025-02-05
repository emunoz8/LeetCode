public class PowerOfFour {

    public static void main(String[] args) {

    }

    public static void test() {
        for (int i = 0; i < 50; i++) {
            int num = (int) Math.pow(4, i);
            System.out.print(num + " ");
            System.out.println(isPowerOfFour(num));
        }

    }

    //similar to Power of two, but you shift twice.
    public static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;

        int binary = 1;

        for (int i = 0; i < 31; i += 2) {
            if (binary == n)
                return true;
            binary <<= 2;
        }

        return false;

    }

}