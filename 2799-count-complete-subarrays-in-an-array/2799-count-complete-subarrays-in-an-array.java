class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int total = set.size();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;
        int l = 0;
        for(int r = 0; r<nums.length; r++){
            freqMap.put(nums[r], freqMap.getOrDefault(nums[r], 0)+1);
            while(freqMap.size()==total){
                count += nums.length-r;
                freqMap.put(nums[l], freqMap.get(nums[l])-1);
                if(freqMap.get(nums[l])==0){
                    freqMap.remove(nums[l]);
                }
                l++;
            }
        }
        return count;
    }
}