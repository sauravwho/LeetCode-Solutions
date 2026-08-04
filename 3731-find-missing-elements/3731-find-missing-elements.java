class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length < 2)
            return res;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            int prev = nums[i - 1];
            int curr = nums[i];
            while (prev + 1 < curr) {
                res.add(prev + 1);
                prev++;
            }
        }
        return res;
    }
}