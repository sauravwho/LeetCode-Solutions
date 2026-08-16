class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix==null || matrix.length == 0)   return res;
        int top = 0;
        int bottom = matrix.length-1;
        int l = 0;
        int r = matrix[0].length-1;
        while(top<=bottom && l<=r){
            for(int i = l; i<=r; i++)   res.add(matrix[top][i]);
            top++;
            for(int i = top; i<=bottom; i++)    res.add(matrix[i][r]);
            r--;
            if(top<=bottom){
                for(int j = r; j>=l; j--)   res.add(matrix[bottom][j]);
                bottom--;
            }
            if(l<=r){
                for(int j = bottom; j>=top; j--)    res.add(matrix[j][l]);
                l++;
            }
        }
        return res;
    }
}