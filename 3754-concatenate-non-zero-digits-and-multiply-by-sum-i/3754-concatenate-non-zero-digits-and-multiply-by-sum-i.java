class Solution {
    public long sumAndMultiply(int n) {
        long res = 0;
        long sum = 0;
        while(n>0){
            if(n%10 != 0){
                sum += n%10;
                res = res*10 + n%10; 
            }
            n /= 10;
        }
        long prod = 0;
        while(res>0){
            prod = prod*10 + res%10;
            res /= 10;
        }
        return prod*sum;
    }
}