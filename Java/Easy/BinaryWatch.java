import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public static void main(String[] args) {

        System.out.println(readBinaryWatch(2));

    }

    //aaah
    ///aaaahhhh
    public static List<String> readBinaryWatch(int turnedOn) {
        List<Integer> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        int registerSize = 10;
        int i, minute, hour, curr, count;
        generateCombinations(0, 0, turnedOn, registerSize, result);

        for (int num : result) {
            minute = 0;
            hour = 0;
            curr = 1;
            count = 0;

            char[] binary = Integer.toBinaryString(num).toCharArray();
            i = binary.length - 1;

            while (count < 6 && i >= 0) {
                if (binary[i--] == '1')
                    minute += curr;

                curr <<= 1;
                count++;
            }

            curr = 1;
            while (i >= 0) {
                if (binary[i--] == '1')
                    hour += curr;
                curr <<= 1;

            }

            list.add(String.format("%02d:%02d", hour, minute));

        }

        return list;

    }

    private static void generateCombinations(int pos, int mask, int remaining, int size, List<Integer> result) {
        if (remaining == 0) {
            result.add(mask);
            return;
        }

        for (int i = pos; i < size; i++)
            generateCombinations(i + 1, mask | (1 << i), remaining - 1, size, result);

    }

}