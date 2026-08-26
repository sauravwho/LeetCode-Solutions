class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int n:nums) sum += n;
        if(Math.abs(target)>sum||(target+sum)%2 != 0)   return 0;
        int subset = (target+sum)/2;
        return countSubset(nums, subset);
    }
    private int countSubset(int[] nums, int sum){
        int[] dp = new int[sum+1];
        dp[0]=1;
        for(int n:nums){
            for(int i = sum;i>= n; i--){
                dp[i] += dp[i-n];
            }
        }
    return dp[sum];
    }
}