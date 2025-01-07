public class MergeSortedArray {

    public static void main(String[] args) {
        int[] a = { 7, 8, 9, 0, 0, 0 };
        int[] b = { 1, 2, 3 };

        merge(a, a.length - b.length, b, b.length);

        for (int n : a)
            System.out.print(n + " ");

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int c = n + m - 1;

        while (i >= 0 && j >= 0)
            if (nums1[i] >= nums2[j])
                nums1[c--] = nums1[i--];
            else
                nums1[c--] = nums2[j--];

        while (j >= 0)
            nums1[c--] = nums2[j--];

    }
}