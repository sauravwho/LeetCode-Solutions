class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[] res = new boolean[queries.length];
        boolean[] next = new boolean[n-1];
        for(int i = 0; i<n-1; i++){
            next[i] = (nums[i+1]-nums[i])<= maxDiff;
        }
        for(int i=0; i<queries.length; i++){
            int l = queries[i][0];
            int m = queries[i][1];
            int mi = Math.min(l,m);
            int ma = Math.max(l,m);
            boolean possible = true;
            for(int j= mi; j<ma; j++){
                if(!next[j]){
                    possible=false;
                    break;
                }  
            }
            res[i] = possible;
        }
        return res;
    }
}