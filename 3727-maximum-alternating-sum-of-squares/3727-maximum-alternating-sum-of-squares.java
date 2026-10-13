class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        for(int i = 0; i<n; i++){
            squares[i] = (long)nums[i]*nums[i];
        }
        Arrays.sort(squares);
        long max = 0;
        int nav = n/2;
        for(int i = 0; i<nav; i++){
            max -= squares[i];
        }
        for(int i = nav; i<n; i++){
            max += squares[i];
        }
        return max;
    }
}