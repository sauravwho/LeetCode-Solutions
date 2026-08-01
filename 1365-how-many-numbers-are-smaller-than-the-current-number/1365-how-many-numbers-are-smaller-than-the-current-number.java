class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for(int i = 0; i<len; i++){
            int count = 0;
            for(int n:nums){
                if(nums[i]>n)   count++;
            }
            res[i] = count;
        }
        return res;
    }
}