public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.println(convertToTitle(7000));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder build = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            build.append((char) ((columnNumber) % 26 + 'A'));
            columnNumber /= 26;

        }

        build.reverse();

        return build.toString();
    }

}