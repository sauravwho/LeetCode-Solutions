class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[k++] = nums1[i];
                i++;
                }
            else{
                arr[k++] = nums2[j];
                j++;
            }
        }
        while(i<n) arr[k++] = nums1[i++];
        while(j<m) arr[k++] = nums2[j++];        
        double med;
        if (k % 2 == 0) med = (arr[k/2 - 1] + arr[k/2]) / 2.0;
        else med = arr[k/2];
        return med;
    }
}