package telran20200406;

public class OneArray {
    public int sum2(int[] nums) {
        int sum = 0;
       if(nums.length>1){
           return nums[0]+nums[1];
       }else if (nums.length>0){
           return nums[0];
       }
       return 0;
    }
}
