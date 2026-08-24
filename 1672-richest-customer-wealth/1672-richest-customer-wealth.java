class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] money = new int[accounts.length];
        int c = 0;
        for(int[] i : accounts){
            int sum = 0;
            for(int j : i)
                sum+=j;
            money[c++] = sum;
        }
        int max = money[0];
        for(int i : money){
            if(i > max)
                max = i;
        }

        return max;
    }
}