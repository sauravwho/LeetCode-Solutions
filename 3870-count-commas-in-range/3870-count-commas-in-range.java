class Solution {
    public int countCommas(int n) {
        int res = 0;
        long start = 1000;
        while(n>= start){
            res += (n-start+1);
            start *= 1000;
        }
        return res;
    }
}