class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for(int i : candies){
            if(i > max)
                max = i;
        }
        for (int i : candies){
            int sum = i + extraCandies;
            if(sum >= max)
                ans.add(true);
            else
                ans.add(false);
        }

        return ans;
    }
}