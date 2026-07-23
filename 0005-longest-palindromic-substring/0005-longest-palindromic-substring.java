class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int left = 0;
        int maxLen = 0;
        for(int i = 0; i<s.length(); i++){
            int lenE = expand(s, i,i);
            int lenO = expand(s,i,i+1);
            int len = Math.max(lenE, lenO);
            if(len>maxLen){
                maxLen=len;
                left = i-(len-1)/2;
            }
        }
        return s.substring(left, left+maxLen);
    }
    private int expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}