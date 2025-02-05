import java.util.Map;
import java.util.HashMap;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map = new HashMap<>();
        int[] rArr;
        int j = 0;

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], false);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]))
                map.put(nums2[i], true);

        }

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (!entry.getValue())
                map.remove(entry);

        }

        rArr = new int[map.size()];

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            rArr[j++] = entry.getKey();
        }

        return rArr;

    }

}