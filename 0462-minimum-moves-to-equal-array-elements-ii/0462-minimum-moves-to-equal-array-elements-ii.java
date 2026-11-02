class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int res = 0;
        for(int n:nums){
            res +=Math.abs(n-median);
        }
        return res;
    }
}