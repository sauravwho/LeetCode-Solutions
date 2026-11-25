class Solution {
    static final long B1 = 100003L, M1 = 1_000_000_007L;
    static final long B2 = 100019L, M2 = 1_000_000_009L;

    public int smallestUniqueSubarray(int[] nums){
        int lo = 1; 
        int hi = nums.length;
        int ans = nums.length;
        while(lo <= hi){
            int mid = (lo+hi) >>> 1;
            if(hasUnique(nums, mid)){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
    private boolean hasUnique(int[] nums, int len){
        long h1 = 0; 
        long h2 = 0; 
        long p1 = 1; 
        long p2 = 1;
        for(int i =0; i<len-1; i++){
            p1 = (p1*B1)%M1;
            p2 = (p2*B2)%M2;
        }
        Map<Long, Integer> freq = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(i>=len){
                h1 = (h1-nums[i-len]*p1%M1+M1)%M1;
                h2 = (h2-nums[i-len]*p2%M2+M2)%M2;
            }
            h1 = (h1 * B1 + nums[i]) % M1;
            h2 = (h2 * B2 + nums[i]) % M2;
            if (i >= len - 1) {
                long key = (h1 << 32) | h2;
                freq.put(key, freq.getOrDefault(key,0)+1);
            }
        }
        for(int c: freq.values()){
           if(c==1) return true; 
        } 
        return false;
    }
}