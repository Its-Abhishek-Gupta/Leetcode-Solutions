class Solution {
    public int missingNumber(int[] nums) {
        int miss = 0;
        for(int i = 0 ; i <= nums.length ; i++){
            boolean found = false;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] == i)
                    found = true;
            }
            if(!found)
                miss = i;
        }
        return miss;
    }
}