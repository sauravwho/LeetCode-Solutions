class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] gcdArr = new int[n];
        int mx = 0;
        for(int i= 0; i<n; i++){
            mx = Math.max(mx, nums[i]);
            gcdArr[i] = gcd(nums[i], mx);
        }
        Arrays.sort(gcdArr);
        long sum = 0;
        for(int i = 0; i<n/2; i++){
            int a = gcdArr[i];
            int b = gcdArr[n-1-i];
            sum += gcd(a,b);
        }
        return sum;
    }
    public int gcd(int a, int b){
        return b==0?Math.abs(a):gcd(b,a%b);
    }
}