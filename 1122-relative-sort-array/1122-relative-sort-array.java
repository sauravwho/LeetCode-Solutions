class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int[] count = new int[1001];
        for (int ele : arr1) {
            count[ele]++;
        }
        int idx = 0;
        for (int n : arr2) {
            while (count[n] > 0) {
                res[idx++] = n;
                count[n]--;
            }
        }
        for (int val = 0; val < count.length; val++) {
            while (count[val] > 0) {
                res[idx++] = val;
                count[val]--;
            }
        }
        return res;
    }
}