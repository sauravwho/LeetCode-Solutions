class Solution {
    public long countCommas(long n) {
        long comma = 0;
        long start = 1000;
        while(n>= start){
            comma += (n-start+1);
            start *= 1000;
        }
        return comma;
    }
}