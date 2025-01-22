import java.util.ArrayList;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));

    }

    public static boolean isHappy(int n) {
        int sum = 0;
        int digit;
        ArrayList<Integer> visited = new ArrayList<>();

        while (!visited.contains(n)) {
            visited.add(n);
            sum = 0;
            while (n > 0) {
                digit = n % 10;
                sum += digit * digit;
                n /= 10;

            }
            if (sum == 1)
                return true;

            n = sum;
        }
        return false;
    }

}