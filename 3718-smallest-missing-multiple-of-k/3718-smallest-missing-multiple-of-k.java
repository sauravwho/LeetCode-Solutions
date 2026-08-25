class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int res = k;
        while(set.contains(res))    res += k;
        return res;
    }
}