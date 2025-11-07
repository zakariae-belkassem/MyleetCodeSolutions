package NotYet;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i;

        for ( i = 0; i < nums1.length+nums2.length; i++) {
            if (nums1[i]>=nums2[0]) {
                break;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new MedianofTwoSortedArrays().findMedianSortedArrays(new int[] {1,3}, new int[] {2}));
    }
}
