class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();

        // Arrays.sort(nums);
        // for(int i =0; i<nums.length; i++){
        //     if(nums[i]==target) res.add(i);
        // }

        int tar = 0;
        int count = 0;
        for(int n:nums){
            if(n<target){
                count++;
            }   
            else if(n==target){
                tar++;
            } 
        }
        for(int i = 0; i<tar; i++){
            res.add(count+i);
        }
        return res;
    }
}
       