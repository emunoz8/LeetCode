public class GuessNumberHigherOrLower {

    public static void main(String[] args) {

    }

    //binary search.
    public static int guessNumber(int n) {
        int state = -1;
        int min = 1, max = n, mid;

        while (min < max) {
            mid = min + (max - min) / 2;

            //state = guess(mid);//API call

            if (state == 0)
                return mid;

            if (state < 0)
                max = mid - 1;
            else
                min = mid + 1;

        }

        return min;

    }
}