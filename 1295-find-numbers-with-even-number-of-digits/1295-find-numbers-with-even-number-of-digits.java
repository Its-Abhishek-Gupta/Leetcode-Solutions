class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int i : nums){
            // int d = 0;
            // while(i > 0){
            //     i = i/10;
            //     d++;
            // }
            String a = i+"";
            int d = a.length();
            if(d % 2 == 0)
                c++;
        }
        return c;
    }
}