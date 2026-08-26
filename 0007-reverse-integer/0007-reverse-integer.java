class Solution {
    public int reverse(int x) {
        long rev = 0;
        if(x < 0){
            x = -x;
            while(x > 0){
                int r = x % 10;
                rev = rev*10+r;
                x = x/10;
            }
            rev = -rev;
        }else{
            while(x > 0){
                int r = x % 10;
                rev = rev * 10 + r;
                x = x / 10;
            }
        }
        if(rev <= Integer.MAX_VALUE && rev >= Integer.MIN_VALUE)
            return (int)rev;
        return 0;
    }
}