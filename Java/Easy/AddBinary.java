public class AddBinary {

    public static void main(String[] args) {
        String ans = addBinary("1111", "111");
        System.out.println(ans);

    }

    public static String addBinary(String a, String b) {
        StringBuilder build = new StringBuilder();
        int val, carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 && j >= 0) {
            val = (a.charAt(i) - '0' + b.charAt(j) - '0') + carry;
            carry = val / 2;
            val %= 2;
            build.append(val);
            i--;
            j--;
        }

        if (i < 0) {
            while (j >= 0) {
                val = (b.charAt(j) - '0') + carry;
                carry = val / 2;
                val %= 2;
                build.append(val);

                j--;
            }
        } else if (j < 0) {
            while (i >= 0) {
                val = (a.charAt(i) - '0') + carry;
                carry = val / 2;
                val %= 2;
                build.append(val);

                i--;
            }

        }
        if (carry > 0)
            build.append(carry);

        build.reverse();

        return build.toString();
    }
}