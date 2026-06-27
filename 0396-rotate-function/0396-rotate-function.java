class Solution {
    public int maxRotateFunction(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int sum = 0;
        int temp = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            temp += i*nums[i];       
        }
        int curr = temp;
        int max = temp;
        for(int j = 1; j<n; j++){
            curr = curr + sum - (n*nums[n-j]);
            if(max<curr) max = curr;
        }
        return max;
    }
}