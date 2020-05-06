package telran20200406;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 1) {
            return nums;
        } else {
            int temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length - 1] = temp;
        }
        return nums;
    }
}
