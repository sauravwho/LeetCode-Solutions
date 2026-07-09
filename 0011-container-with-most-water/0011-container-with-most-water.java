class Solution {
    public int maxArea(int[] height) {
        int vol = 0;
        int l = 0;
        int r = height.length-1;
        while(l<r){
            int len = r-l;
            int hei = Math.min(height[l], height[r]);
            vol = Math.max(len*hei, vol);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return vol;
    }
}