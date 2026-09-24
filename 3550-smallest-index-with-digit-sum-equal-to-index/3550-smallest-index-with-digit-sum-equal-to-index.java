class Solution {
    public int smallestIndex(int[] nums) {
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            if(digitSum(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
    private int digitSum(int n){
        int res = 0;
        while(n != 0){
            res += n%10;
            n /= 10;
        }
        return res;
    }
}