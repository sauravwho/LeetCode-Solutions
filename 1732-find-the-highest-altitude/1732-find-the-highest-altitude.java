class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int res = 0;
        int curr = 0;
        for(int i = 0; i<n; i++){
            curr += gain[i];
            res = Math.max(res, curr);
        }
        return res;
    }
}