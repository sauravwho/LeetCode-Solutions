class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        int n = needle.length();
        int h = haystack.length();
        for(int i = 0; i<= h-n; i++){
            if(haystack.substring(i, i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}