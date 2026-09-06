class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        int hottest = 0;
        for (int i = n - 1; i >= 0; i--) {
            int curr = temperatures[i];
            if (curr >= hottest) {
                hottest = curr;
                continue;
            }
            int days = 1;
            while (temperatures[i + days] <= curr) {
                days += ans[i + days];
            }
            ans[i] = days;
        }
        return ans;
    }
}