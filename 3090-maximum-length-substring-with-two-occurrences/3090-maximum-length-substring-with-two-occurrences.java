class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int l = 0;
        int max = 0;
        for(int r = 0; r<s.length(); r++){
            char curr = s.charAt(r);
            count[curr-'a']++;
            while(count[curr-'a']>2){
                count[s.charAt(l)-'a']--;
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}