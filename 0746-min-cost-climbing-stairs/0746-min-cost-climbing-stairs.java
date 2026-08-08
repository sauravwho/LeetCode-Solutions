class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int curr = cost[1];
        int prev = cost[0];
        for(int i = 2; i<cost.length; i++){
            int c = cost[i]+Math.min(curr, prev);
            prev = curr;
            curr = c;
        }
        return Math.min(curr, prev);
    }
}