class Solution {
    public List<List<String>> partition(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int right=0; right<n; right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || dp[left + 1][right - 1])) {
                    dp[left][right] = true;
                }
            }
        }
        List<List<String>> res= new ArrayList<>();
        backtrack(s, 0, dp, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(String s, int start, boolean[][] dp, List<String> curr, List<List<String>> res) {
        if (start==s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int end=start; end<s.length(); end++) {
            if (dp[start][end]) {
                curr.add(s.substring(start, end + 1));
                backtrack(s, end + 1, dp, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }
}