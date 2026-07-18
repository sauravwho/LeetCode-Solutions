class Solution {
    public int findGCD(int[] nums) {
        int a = nums[0];
        int b = nums[0];
        for(int num:nums){
            a = Math.min(a, num);
            b = Math.max(b, num);
        }
        return gcd(a,b);
    }
    private int gcd(int a, int b){
        return b==0?a:gcd(b,a%b);
    }
}