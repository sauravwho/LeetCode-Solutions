class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int res = 0;
        for(int i = 0; i<len; i++){
            res += (i/8)+1;
        }
        return res;
    }
}