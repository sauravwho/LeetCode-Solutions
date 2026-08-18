class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] mat:matrix){
            for(int m:mat){
                if(m==target){
                    return true;
                }
                
            }
        }
        return false;
    }
}