class Solution {
    public String crackSafe(int n, int k) {
        StringBuilder res = new StringBuilder();
        StringBuilder start = new StringBuilder();
        for(int i = 0; i<n-1; i++)  start.append('0');
        Set<String> vis = new HashSet<>();
        dfs(start.toString(), n, k, vis, res);
        res.append(start);
        return res.toString();
    }
    private void dfs(String node, int n, int k, Set<String> vis, StringBuilder res){
        for(int i = 0; i<k; i++){
            String edge = node+i;
            if(!vis .contains(edge)){
                vis.add(edge);
                String next = edge.substring(1);
                dfs(next, n, k, vis, res);
                res.append(i);
            }
        }
    }
}