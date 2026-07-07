class Solution {
    public long sumAndMultiply(int n) {
        long res = 0;
        long sum = 0;
        int i = 1; 
        while(n>0){
            if(n%10 != 0){
                sum += n%10;
                res += n%10*i; 
                i *= 10;
            }
            n /= 10;
        }
        return res*sum;
    }
}