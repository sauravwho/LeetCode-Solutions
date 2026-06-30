class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        int res= 1;
        while(res<n){
            res*= 2;
            if(res <= Integer.MIN_VALUE){
                break;
            }
            System.out.println(res);
        }
        return res==n;
    }
}