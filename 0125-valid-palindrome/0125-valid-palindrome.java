class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder data = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0'&& s.charAt(i) <='9'))
                data.append(s.charAt(i));
        }
        int start = 0;
        int end = data.length()-1;
        while(start<=end){
            if(data.charAt(start)!=data.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}