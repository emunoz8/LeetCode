import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = { 0, 2, 3, 4, 6, 8, 9 };

        System.out.println(summaryRanges(nums));

    }

    //optimal
    public static List<String> optimalSummaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        int curr, end;

        for (int i = 0; i < nums.length; i++) {
            StringBuilder build = new StringBuilder();
            curr = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1])
                i++;

            end = nums[i];

            if (curr == end)
                build.append(end);
            else
                build.append(curr).append("->").append(end);//appending instead of concactinating makes it a lot more effecient.... interesting.

            list.add(build.toString());

        }

        return list;

    }

    //super slow
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        int curr, end;

        for (int i = 0; i < nums.length; i++) {
            String range;
            curr = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1])
                i++;

            end = nums[i];

            range = curr == end ? "" + curr : curr + "->" + end;

            list.add(range);

        }

        return list;

    }
}