class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int val = nums[nums.length-1]+2;
        int[] arr = new int[val];
        int res = 0;
        for(int n: nums){
            arr[n+1]= arr[n]+1;
            arr[n] = arr[n-1]+1;
            res = Math.max(res, Math.max(arr[n], arr[n+1]));
        }
        return res;
    }
}
