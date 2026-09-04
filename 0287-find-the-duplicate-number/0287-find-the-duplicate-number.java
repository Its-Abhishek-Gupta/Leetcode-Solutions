class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] == nums[correct] && i == (nums.length-1))
                return nums[i];
            else if(nums[i] == nums[correct])
                i++;
            else{
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        return -1;
    }
}