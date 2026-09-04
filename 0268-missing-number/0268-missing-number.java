class Solution {
    public int missingNumber(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i];
            if(i == correct || correct >= nums.length)
                i++;
            else{
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        for(i = 0 ; i < nums.length ; i++){
            if(i != nums[i])
                return i;
        }
        return nums.length;
    }
}