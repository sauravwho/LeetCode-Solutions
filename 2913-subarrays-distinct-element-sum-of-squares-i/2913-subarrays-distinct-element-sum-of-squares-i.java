class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int res = 0;
        for(int i = 0; i<n; i++){
            Set<Integer> dist = new HashSet<>();
            for(int j = i; j<n; j++){
                dist.add(nums.get(j));
                int count = dist.size();
                res +=(count*count);
            }
        }
        return res;
    }
}