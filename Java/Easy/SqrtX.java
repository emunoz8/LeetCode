public class SqrtX {

    public static void main(String[] args) {
        int ans = mySqrt(9);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {

        float num = 1.0f;

        do {
            num += .01f;

        } while (num * num < x);

        return (int) Math.round(num);

    }

}
