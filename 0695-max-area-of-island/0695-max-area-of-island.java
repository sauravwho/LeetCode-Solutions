class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0)   return 0;
        int row = grid.length;
        int col = grid[0].length;
        int area = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == 1){
                    int curr = dfs(grid, i, j);
                    area = Math.max(area, curr);
                }
            }
        }return area;
    }
    private int dfs(int[][] grid, int r, int c){
        int rows = grid.length;
        int cols = grid[0].length;
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        return 1 + dfs(grid, r + 1, c) + dfs(grid, r - 1, c) + dfs(grid, r, c + 1)+ dfs(grid, r, c - 1);
    }
}