class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        long eCount = 1; 
        long oCount = 0;
        long currPrefixSum = 0;
        long oddSubarrays = 0;
        for(int num : arr){
            currPrefixSum += num;
            if(currPrefixSum%2 == 0){
                oddSubarrays = (oddSubarrays+oCount) %MOD;
                eCount++;
            } else{
                oddSubarrays = (oddSubarrays+eCount)%MOD;
                oCount++;
            }
        }
        return (int)oddSubarrays;
    }
}