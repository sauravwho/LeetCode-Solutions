class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if(s==null || n==0) return 0;
        int i = 0;

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        if(n==i) return 0;

        int sign=1;
        if(s.charAt(i)=='-'||s.charAt(i)=='+'){
            sign = s.charAt(i)=='-'?-1:1;
            i++;
        }        
        
        int res = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int dig = s.charAt(i)-'0';
            if(res>Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && dig>Integer.MAX_VALUE%10))
                return (sign==1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res*10 + dig;
            i++;
        }
        return res*sign;
    }
}