class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> idxMap = new HashMap<>();
        idxMap.put(0,-1);
        int prefixSum = 0;
        for(int i = 0; i<nums.length; i++){
            prefixSum += nums[i];
            int remainder = prefixSum%k;
            if(idxMap.containsKey(remainder)){
                if(i-idxMap.get(remainder)>=2) {
                    return true;
                }
            }
            else{
                idxMap.put(remainder, i);
            }
        }
        return false;
    }
}