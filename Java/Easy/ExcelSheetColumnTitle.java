public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.println(convertToTitle(702));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder build = new StringBuilder();

        int n = 1, d, r;
        int sum = columnNumber;

        for (; sum > 0; n++)
            sum -= Math.pow(26, n);

        for (int i = 1; i < n; i++) {

        }
        System.out.println(n);
        System.out.println(columnNumber / 26);
        System.out.println(columnNumber % 26);

        //System.out.println((char) ((columnNumber % 27) + 64));

        return "";
    }

}