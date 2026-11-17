class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int INF = 1_000_000;
        int[][] cost = new int[n][n];
        for(int[] row : cost){
            Arrays.fill(row, INF);
        }
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                cost[i][j] = getSemiPalindromeCost(s, i, j);
            }
        }
        int[][] dp = new int[n+1][k+1];
        for(int[] row : dp){
            Arrays.fill(row, INF);
        }
        dp[0][0] = 0;
        for(int p =1; p <= k; p++){
            for(int i = 2*p; i <= n; i++){
                for(int j = 2*(p-1); j <= i-2; j++){
                    if (dp[j][p-1] != INF) {
                        dp[i][p] = Math.min(dp[i][p], dp[j][p-1] + cost[j][i-1]);
                    }
                }
            }
        }
        return dp[n][k];
    }
    private int getSemiPalindromeCost(String s, int start, int end){
        int len = end-start+1;
        int minChanges = Integer.MAX_VALUE;
        for(int d = 1; d*d<=len; d++){
            if(len%d==0){
                minChanges = Math.min(minChanges, countChangesForDivisor(s, start,len,d));
                int otherDivisor = len/d;
                if(otherDivisor<len&&otherDivisor!=d){
                    minChanges = Math.min(minChanges, countChangesForDivisor(s, start, len, otherDivisor));
                }
            }
        }
        return minChanges;
    }
    private int countChangesForDivisor(String s, int start, int len, int d){
        int changes = 0;
        int groupSize = len/d;
        for(int rem = 0; rem<d;rem++){
            int left = 0;
            int right = groupSize-1;
            while(left<right){
                char leftChar = s.charAt(start+rem+left*d);
                char rightChar = s.charAt(start+rem+right*d);
                if(leftChar !=rightChar)   changes++;
                left++;
                right--;
            }
        }
        return changes;
    }
}