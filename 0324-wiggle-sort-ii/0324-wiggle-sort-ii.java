class Solution {
    public void wiggleSort(int[] nums) {
        int[] dummy = nums.clone();
        int len = nums.length;
        Arrays.sort(dummy);
        int large = len-1;
        int small = (len-1)/2;
        for(int i=0; i<len; i++){
            if (i % 2 == 1) {
                nums[i] = dummy[large--];
            } else {
                nums[i] = dummy[small--];
            }
        }
    }
}