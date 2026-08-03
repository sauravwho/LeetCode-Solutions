class Solution {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        int slow = n;
        int fast = next(n);
        while (fast != 1 && slow != fast) {
            slow = next(slow);
            fast = next(next(fast));
        }
        return  fast==1;       
    }
    private int next(int n){
        int res = 0;
        while(n>0){
            int dig = n%10;
            res += dig*dig;
            n /=10;
        }
        return res;
    }
}