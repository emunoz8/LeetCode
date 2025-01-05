
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = new int[] { 9, 9, 9, 9, 8, 9 };

        int[] nums = plusOne(digits);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

    }

    public static int[] plusOne(int[] digits) {
        int[] rArr;
        int least = digits.length - 1, carry = 0;
        digits[least]++;

        while (least >= 0) {
            digits[least] += carry;
            carry = digits[least] / 10;
            digits[least] %= 10;
            least--;
            if (carry == 0)
                return digits;
        }

        if (carry > 0) {
            rArr = new int[digits.length + 1];
            rArr[0] = carry;
            for (int i = 1; i < rArr.length; i++)
                rArr[i] = digits[i - 1];
        } else {
            rArr = digits;
        }
        return rArr;
    }
}