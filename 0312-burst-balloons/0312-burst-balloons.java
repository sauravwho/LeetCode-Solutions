class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] no = new int[n+2];
        no[0]  = 1;
        no[n+1] = 1;
        for(int i = 0; i<n; i++) no[i+1] = nums[i];
        int[][] dp = new int[n+2][n+2];
        for(int len = 2; len <= n+1; len++){
            for(int i = 0; i<= n+1-len; i++){
                int j = i+len;
                for(int k=i+1; k<j; k++){
                    int coin = no[i] * no[k] * no[j] + dp[i][k] + dp[k][j];
                    dp[i][j] = Math.max(dp[i][j], coin);
                }
            }
        }
        return dp[0][n+1];
    }
}