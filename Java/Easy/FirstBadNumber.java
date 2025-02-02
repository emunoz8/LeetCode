public class FirstBadNumber {

    public static void main(String[] args) {
        int n = 2126753390;
        boolean[] nums = new boolean[n];

        for (int i = 1702766719; i < n; i++)
            nums[i] = true;

        System.out.println(firstBadVersion(nums, nums.length - 1));

    }

    public static boolean isBadVersion(boolean[] nums, int i) {
        return nums[i];
    }

    //binary search for true
    //mid = (max -min)/2

    /*
    while(min +1 != max){
    if(isBadVersion(mid)){
        max =mid
    
        }else{
         min = mid;
        }
    }
    */
    //binary search
    public static int firstBadVersion(boolean[] nums, int n) {
        int min = 1;
        int max = n;
        int mid;

        while (min < max) {//originally had min != max, which was slower. Less than operator is more effecient
            mid = min + (max - min) / 2;

            if (isBadVersion(nums, mid))
                max = mid;
            else
                min = mid + 1;

            mid = min + (max - min) / 2;

        }
        return min;

    }

}