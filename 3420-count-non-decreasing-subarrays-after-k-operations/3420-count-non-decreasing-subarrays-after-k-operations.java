class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        long op = 0;
        int r = n-1;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = n-1; i>= 0; i--){
            while(!dq.isEmpty() && nums[dq.peekFirst()]<= nums[i]){
                int p = dq.pollFirst();
                int next = dq.isEmpty()? r+1:dq.peekFirst();
                op += (long) (next-p)*(nums[i]-nums[p]);
            }
            dq.offerFirst(i);
            while(op>k){
                int maxIdx = dq.peekLast();
                op -= (nums[maxIdx]-nums[r]);
                r--;
                if(maxIdx>r){
                    dq.pollLast();
                }
            }
            ans += (r-i+1);
        }
        return ans;
    }
}