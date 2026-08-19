class Solution {
    public int uniquePaths(int m, int n) {
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            res[i] = 1;
        }
        for(int j = 1; j<m; j++){
            for(int i = 1; i<n; i++){
                res[i] += res[i-1];
            }
        }
        return res[n-1];
    }
}