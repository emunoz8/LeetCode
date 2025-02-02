public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));

    }

    //LeetCode, optimal:

    public static int optimalAddDigits(int num) {
        if (num <= 9) {
            return num;
        } else if (num % 9 == 0)
            return 9;

        else {
            return num % 9;
        }

    }

    public static int addDigits(int num) {
        int digit;
        int curr = num;
        int sum = 0;

        while (curr > 9) {
            num = curr;
            sum = 0;

            while (num > 0) {
                digit = num % 10;
                sum += digit;
                num /= 10;
            }

            curr = sum;

        }

        return curr;
    }

}