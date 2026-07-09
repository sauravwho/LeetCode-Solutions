class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[] res = new boolean[queries.length];
        int[] next = new int[n];
        int val = 0;
        next[0] = val;

        for(int i = 1; i<n; i++){
            if(nums[i]-nums[i-1]> maxDiff) val++;
            next[i] = val;
        }
        for(int i=0; i<queries.length; i++){
            int l = queries[i][0];
            int m = queries[i][1];
            res[i] = next[l] == next[m];
        }
        return res;
    }
}