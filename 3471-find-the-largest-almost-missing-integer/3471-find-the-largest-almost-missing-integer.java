class Solution {
    public int largestInteger(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, Integer> subarray = new HashMap<>();
        for(int i = 0; i<=len-k; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i; j<i+k; j++){
                set.add(nums[j]);
            }
            for(int num: set){
                subarray.put(num, subarray.getOrDefault(num, 0)+1);
            }
        }
        int maxVal = -1;
        for (Map.Entry<Integer, Integer> entry : subarray.entrySet()) {
            if (entry.getValue() == 1) {
                maxVal = Math.max(maxVal, entry.getKey());
            }
        }
        return maxVal;
    }
}