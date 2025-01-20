public class TitleToNumber {

    public static void main(String[] args) {

        int ans = titleToNumber("JIF");

        System.out.println(ans);

    }

    public static int titleToNumber(String columnTitle) {
        int num = 0;

        for (int i = columnTitle.length() - 1, j = 0; i >= 0; i--, j++) {
            num += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, j);
        }

        return num;
    }
}