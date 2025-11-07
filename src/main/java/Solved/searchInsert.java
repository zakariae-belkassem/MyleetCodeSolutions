package Solved;

public class searchInsert {

        public static  int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) return mid;
                if (nums[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
            return left; // position to insert
        }


    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1}, 1));
    }
}
