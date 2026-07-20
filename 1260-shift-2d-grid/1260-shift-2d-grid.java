class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int total = row*col;
        k %= total;
        Integer[][] res = new Integer[row][col];
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                int idx = (r*col + c + k)%total;
                 int newR = idx/col;
                 int newC = idx%col;
                 res[newR][newC] = grid[r][c];
            }
        }
        List<List<Integer>> resArray = new ArrayList<>();
        for(Integer[] r:res){
            resArray.add(Arrays.asList(r));
        }
        return resArray;
    }
}