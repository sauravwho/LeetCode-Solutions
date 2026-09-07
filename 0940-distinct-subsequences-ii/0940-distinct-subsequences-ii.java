class Solution {
    public int distinctSubseqII(String s) {
        int mod = 1000000007;
        long[] last = new long[26];
        long total = 0;
        for(char c:s.toCharArray()){
            int idx = c-'a';
            long newSeq = (total+1)%mod;
            total = (total+newSeq - last[idx]+mod)%mod;
            last[idx] = newSeq;
        }
        return (int) total;
    }
}