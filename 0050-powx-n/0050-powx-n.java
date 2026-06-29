class Solution {
    public double myPow(double x, int n) {
        long p = n;
        double res = 1.0;
        if(p < 0){
            x = 1/x;
            p = -p;
        }
        double val = x;
        while (p>0) {
            if(p%2 == 1){
                res *=val;
            }
            val *= val;
            p /= 2;
        }
        return res;
    }
}