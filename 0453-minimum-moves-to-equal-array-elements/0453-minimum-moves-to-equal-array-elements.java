class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n:nums){
            min = Math.min(min, n);
        }
        int res = 0;
        for(int n : nums){
            res+= n-min;
        }
        return res;
    }
}