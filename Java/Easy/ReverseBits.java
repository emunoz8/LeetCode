public class ReverseBits {

    public static void main(String[] args) {

        System.out.println(reverseBits(43261596));

    }

    //LeetCode solution
    /*
     * 32 bits represent int
     * 1) shifts bit to the right on ans by one
     * 2) (n & 1) extracts the Least Significan Bit from n , 'ans |=' appends  it to the end of ans
     * 3) shifts n to the right, getting a a new LSB
     */
    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;

    }
}