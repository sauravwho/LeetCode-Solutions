class Solution {
    public int longestSubsequence(int[] nums) {
        int res = nums.length;
        int totalXOR = 0;
        boolean nonZero = false;
        for(int n:nums){
            totalXOR ^= n;
            if(n != 0)  nonZero = true;
        }
        if(!nonZero)    return 0;
        if(totalXOR != 0)   return res;
        return res-1;
    }
}