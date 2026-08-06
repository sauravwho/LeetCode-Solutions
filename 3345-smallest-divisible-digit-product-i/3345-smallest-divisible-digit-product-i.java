class Solution {
    public int smallestNumber(int n, int t) {
        int res = n;
        while(prod(res)%t != 0){
            res++;
        }
        return res;
    }
    private int prod(int n){
        int temp = 1;
        while(n>0){
            temp *= n%10;
            n /= 10;
        }
        return temp;
    }
}