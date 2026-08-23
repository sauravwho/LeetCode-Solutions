class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n/2;
        int lSum = 0;
        int rSum = 0;
        int l = 0;
        int r = 0;
        for(int i = 0; i<half; i++){
            char c = num.charAt(i);
            if(c == '?')    l++;
            else    lSum += c-'0';
        }
        for(int i = half; i<n; i++){
            char c = num.charAt(i);
            if(c == '?')    r++;
            else    rSum += c-'0';
        }
        return 2*(lSum-rSum) != 9*(r-l);
    }
}