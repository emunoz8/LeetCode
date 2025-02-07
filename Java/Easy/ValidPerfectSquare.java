public class ValidPerfectSquare {

    public static void main(String[] args) {

    }

    //for larger numbers, long is needed. Missed that in first iteration. Binary search
    public static boolean isPerfectSquare(int num) {

        int max = num / 2 + 1;
        int min = 0;
        int sqrt;
        long ans;
        while (min <= max) {
            sqrt = min + (max - min) / 2;
            ans = (long) sqrt * sqrt;

            if (ans == num)
                return true;

            if (ans > num)
                max = sqrt - 1;
            else
                min = sqrt + 1;

        }

        return false;
    }
}