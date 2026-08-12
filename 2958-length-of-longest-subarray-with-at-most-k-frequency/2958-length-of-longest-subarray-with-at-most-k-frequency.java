class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int len = 0; 
        for(int r = 0; r<nums.length; r++){
            int rnum = nums[r];
            map.put(rnum, map.getOrDefault(rnum, 0)+1);
            while(map.get(rnum)>k){
                int lnum = nums[l];
                map.put(lnum, map.getOrDefault(lnum, 0)-1);
                l++;
            }
                len = Math.max(len, r-l+1);
        }
        return len;
    }
}