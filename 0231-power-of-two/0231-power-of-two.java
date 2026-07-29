class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=-31;
        while(i<31){
            if(Math.pow(2,i) == n){
                return true;
            }
            i++;
        }
        return false;
    }
}