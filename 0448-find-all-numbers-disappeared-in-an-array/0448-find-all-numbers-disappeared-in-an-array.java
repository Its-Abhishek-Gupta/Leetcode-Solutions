class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] == nums[correct])
                i++;
            else{
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        for(int j = 0 ; j < nums.length ; j++){
            if(j != nums[j]-1)
                res.add((j+1));
        }
        return res;
    }
}