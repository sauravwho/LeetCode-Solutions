class Solution {
    public int minimumDeletions(int[] nums) {
        int len = nums.length;
        if(len<=2)    return len;
        int minIdx = 0;
        int maxIdx = 0;
        for(int i = 1; i< len; i++){
            if(nums[i] > nums[maxIdx])  maxIdx = i;
            if(nums[i] < nums[minIdx])  minIdx = i;
        }
        int l = Math.min(minIdx, maxIdx);
        int r = Math.max(minIdx, maxIdx);
        int removeFront = r+1;
        int removeBack = len-l;
        int remove = (l+1)+(len-r);
        return Math.min(removeFront, Math.min(removeBack, remove));
    }
}