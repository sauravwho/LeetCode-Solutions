class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int res[][] = new int[n][m];
        int i = 0;
        int j = 0;
        while(n>i && j<m){
            res[i][j] = Math.min(rowSum[i], colSum[j]);
            rowSum[i] -= res[i][j];
            colSum[j] -= res[i][j];
            if(rowSum[i]==0){
                i++;
            }
            else{
                j++;
            }
        }
        return res;
    }
}