class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, new ArrayList<>(), new boolean[nums.length], res);
        return res;
    }
    private void backTrack(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> res){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(used[i]) continue;
            used[i]=true;
            curr.add(nums[i]);
            backTrack(nums, curr, used, res);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
}