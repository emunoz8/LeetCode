package RomanToInt;

import java.util.HashMap;
import java.util.Map;

class RomanToInt {
    public static void main(String[] args) {

        System.out.println(romanToInt("MDCXCV"));

    }

    public static int romanToInt(String s) {

        Map<Character, Integer> roman = new HashMap<>();
        int val = 0, nextVal = 0, sum = 0;
        boolean hasNext = false;

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            val = roman.get(s.charAt(i));

            if (i + 1 < s.length()) {
                nextVal = roman.get(s.charAt(i + 1));
                hasNext = true;
            }
            if (val < nextVal && hasNext) {
                sum += nextVal - val;
                i++;
            } else
                sum += val;

            hasNext = false;
        }

        return sum;
    }

}