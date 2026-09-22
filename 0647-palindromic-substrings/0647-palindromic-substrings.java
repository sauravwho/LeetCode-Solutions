class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;
        for(int r = 0; r<n; r++){
            for(int l = 0; l<= r; l++){
                if(s.charAt(l) == s.charAt(r) && (r-l<=2 || dp[l+1][r-1])){
                    dp[l][r] = true;
                    count++;
                }
            }
        }
        return count;
    }
}