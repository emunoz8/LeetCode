public class CountingBits {

    public static void main(String[] args) {

    }

    //checks for a general pattern, divide in rows of 4
    public static void test() {

        for (int i = 0; i < 1000; i++) {

            String binary = Integer.toBinaryString(i);
            int count = 0;

            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1')
                    count++;
            }

            System.out.print(count + " ");

            if (i % 4 == 0)
                System.out.println();

        }

    }

    public static int[] countBits(int n) {
        int[] rArr = new int[n + 1];

        for (int i = 1; i <= n; i++)
            rArr[i] = rArr[i >> 1] + (i & 1);

        return rArr;
    }

}