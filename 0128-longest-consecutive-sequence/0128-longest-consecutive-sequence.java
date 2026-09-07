class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null|| nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxLen = 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr = num;
                int currStreak = 1;
                while(set.contains(curr+1)){
                    curr++;
                    currStreak++;
                }
                maxLen = Math.max(maxLen, currStreak);
            }
        }
        return maxLen;
    }
}