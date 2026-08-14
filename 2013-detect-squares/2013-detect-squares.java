class DetectSquares {
    private final List<int[]> points;
    private final int[][] count; 
    public DetectSquares() {
        points = new ArrayList<>();
        count = new int[1001][1001];
    }

    public void add(int[] point) {
        points.add(point);
        count[point[0]][point[1]]++;
    }
    
    public int count(int[] point) {
        int x1 = point[0];
        int y1 = point[1];
        int res = 0;
        for(int[] p:points){
            int x2 = p[0];
            int y2 = p[1];
            if(Math.abs(x1-x2)==Math.abs(y1-y2)&& x1 != x2){
                res += count[x1][y2] * count[x2][y1];
            }
        }
        return res;
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */