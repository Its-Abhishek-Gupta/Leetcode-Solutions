class Solution {
    public int removeElement(int[] nums, int val) {
        int[] expectedNums = new int[nums.length];
        int k = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] != val){
                expectedNums[k++] = nums[i];
                i++;
            }else{
                i++;
            }
        }
        for(i = 0 ; i < k ; i++)
            nums[i] = expectedNums[i];
        return k;
    }
}