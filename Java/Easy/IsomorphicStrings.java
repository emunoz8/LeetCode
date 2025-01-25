import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("title", "paper"));
    }

    //Super slow
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char sCurr, tCurr;

        for (int i = 0; i < s.length(); i++) {
            sCurr = s.charAt(i);
            tCurr = t.charAt(i);

            if (map.containsKey(sCurr) && map.get(sCurr) != tCurr)
                return false;
            else if (map.containsValue(tCurr) && !map.containsKey(sCurr))
                return false;
            else {
                map.put(sCurr, tCurr);
            }

        }

        return true;
    }

}