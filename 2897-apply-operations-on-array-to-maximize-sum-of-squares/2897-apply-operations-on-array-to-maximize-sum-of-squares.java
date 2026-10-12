class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long mod = 1000000007L;
        int[] count = new int[31];
        for(int n:nums){
            for(int b =0; b<30; b++){
                if((n&(1<<b))!=0)   count[b]++;
            }
        }
        long sum = 0;
        for(int i = 0; i<k; i++){
            long curr = 0;
            for(int b = 0;b<30; b++){
                if(count[b]>0){
                    curr |= (1L<<b);
                    count[b]--;
                }
            }
            long square= (curr*curr)%mod;
            sum = (sum + square) %mod;
        }
        return (int)sum;
    }
}