class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // Set<Integer> res = new HashSet<>();
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i; j<nums.length; j++){
        //         for(int k = j; k<nums.length; k++){
        //             res.add(nums[i]^nums[j]^nums[k]);
        //         }
        //     }
        // }
        // return res.size();

        int n = nums.length;
        if(n <=2){
            return n;
        }
        int len = 32-Integer.numberOfLeadingZeros(n);
        return 1<<len;
    }
}