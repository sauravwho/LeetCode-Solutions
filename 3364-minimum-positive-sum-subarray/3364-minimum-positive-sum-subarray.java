class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int curr = 0;
            for(int j = i; j<n; j++){
                curr += nums.get(j);
                int len = j-i+1;
                if(len>= l && len<= r && curr>0){
                    minSum = Math.min(minSum, curr);
                }
                if(len>r)   break;
            }
        }
        return minSum == Integer.MAX_VALUE?-1:minSum;
    }
}