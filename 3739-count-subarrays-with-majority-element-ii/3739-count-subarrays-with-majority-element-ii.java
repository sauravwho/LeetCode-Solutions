class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        long total = 0;
        int sum1 = 0;
        int[] freq = new int[2*n+1];
        freq[n]=1;
        long sum2 = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == target){
                sum2 += freq[sum1+n];
                sum1++;
            }else{
                sum1--;
                sum2 -=freq[sum1+n];
            }
            total += sum2;
            freq[sum1+n]++;
        }
        return total;
    }
}