class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    private void backTrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> res){
        if(target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i = start; i<candidates.length; i++){
            if(candidates[i]>target)    break;
            current.add(candidates[i]);
            backTrack(candidates, target-candidates[i], i, current, res);
            current.remove(current.size()-1);
        }

    }
}