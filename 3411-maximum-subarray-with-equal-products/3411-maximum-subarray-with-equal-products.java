class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int resLen = 2;
        int maxPossibleLcm = 2520;
        for(int i=0;i<n; i++){
            long prod = nums[i];
            int currentGcd = nums[i];
            int currentLcm = nums[i];
            for(int j = i+1; j<n; j++){
                prod *= nums[j];
                if(prod > maxPossibleLcm)  break;
                currentGcd = gcd(currentGcd, nums[j]);
                currentLcm = lcm(currentLcm, nums[j]);
                if(prod == (long) currentGcd*currentLcm)   resLen = Math.max(resLen, j-i+1);
            }
        }
        return resLen;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    private int lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }
}