class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        long res = 0;
        long mod = 1000000007L;
        for(int i = 0; i<n; i++){
            Set<Integer> dist = new HashSet<>();
            for(int j = i; j<n; j++){
                dist.add(nums.get(j));
                int count = dist.size();
                res = (res+ (long)count*count) % mod;
            }
        }
        return (int) res;
    }
}