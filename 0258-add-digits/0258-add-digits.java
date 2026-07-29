class Solution {
    public int addDigits(int num) {
        if(num<9)
            return num;
        else{
            int add = 100;
            while(add>9){
                int sum =0 ;
                while(num>0){
                    int rem = num%10;
                    sum += rem;
                    num = num/10;
                }
                num = sum;
                add = sum;
            }
            return add;
        }
    }
}