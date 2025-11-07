package NotYet;

public class FindTriangularSumofanArray {
    public int triangularSum(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] temp = new int[nums.length-1];
        int j = 0;
        for (int i = 0; i < nums.length; i+=2) {
            if(i+1>nums.length) {
                temp[j] = nums[i];
                break;
            }
            temp[j] = nums[i]+nums[i+1];
            j++;
        }
        return triangularSum(temp);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(new FindTriangularSumofanArray().triangularSum(nums));

    }
}


