class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length -1])
            return nums.length;
        if(target < nums[0])
         return 0;
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        int max =  Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > target && nums[i] < max)
                max = i;
        }
        return max;
    }
}