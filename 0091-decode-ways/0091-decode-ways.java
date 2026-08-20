class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0 || s.charAt(0)=='0')  return 0;
        int prev1 = 1;
        int prev2 = 1;
        for(int i = 1; i<s.length(); i++){
            int curr = 0;
            int one = s.charAt(i)-'0';
            int two = Integer.parseInt(s.substring(i-1, i+1));
            if(one >= 1 && one <= 9)    curr += prev1;
            if(two >= 10 && two <= 26)  curr += prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}