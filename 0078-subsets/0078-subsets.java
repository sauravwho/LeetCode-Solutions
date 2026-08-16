class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int n:nums){
            int len = res.size();
            for(int i = 0; i<len; i++){
                List<Integer> lst = new ArrayList<>(res.get(i));
                lst.add(n);
                res.add(lst);
            }
        }
        return res;
    }
}