class Solution {
    public int longestSubsequence(String s, int k) {
        int length = 0;
        long curr = 0;
        int n = s.length();
        for (int i = n-1; i>=0; i--) {
            char ch = s.charAt(i);
            if (ch == '0') {
                length++;
            } else {
                if (length<30 && curr+(1L<<length)<=k) {
                    curr += (1L<<length);
                    length++;
                }
            }
        }
        return length;
    }
}