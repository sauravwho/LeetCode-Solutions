class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int middle = low+(high-low)/2;
            int val = nums[middle];
            if(val<target) low = middle+1;
            else if(val>target) high = middle-1;
            else return middle;
        }
        return -1;

        // int idx = Arrays.binarySearch(nums, target);
        // return idx>-1?idx:-1;
    }
}