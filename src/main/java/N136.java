import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class N136 {

    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];

        List<Integer> list = new ArrayList<>(nums.length/2);
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }else{
                list.remove((Integer) nums[i]);
            }
        }

        return list.getFirst();
    }


    public static void main(String[] args) {
        System.out.println(new N136().singleNumber(new int[]{4,1,2,1,2}));
    }
}
