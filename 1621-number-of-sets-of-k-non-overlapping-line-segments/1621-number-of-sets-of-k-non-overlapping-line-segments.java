class Solution {
    public int numberOfSets(int n, int k) {
        int mod = 1000000007;
        int[][] dp = new int[n+1][k+1];
        for(int i = 1; i<= n; i++){
            dp[i][0] = 1;
        }
        for(int j = 1; j<= k; j++){
            long prefix = 0;
            for(int i=2; i<= n; i++){
                prefix = (prefix + dp[i-1][j-1])%mod;
                dp[i][j] = (int) ((dp[i-1][j] + prefix)%mod);
            }
        }
        return dp[n][k];
    }
}