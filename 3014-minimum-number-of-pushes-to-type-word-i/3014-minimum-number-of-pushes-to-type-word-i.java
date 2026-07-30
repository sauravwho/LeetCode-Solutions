class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int res = 0;
        // for(int i = 0; i<len; i++){
        //     res += (i/8)+1;
        // }
        if(len>0) res += Math.min(len, 8);
        if(len>8) res += Math.min(len-8, 8)*2;
        if(len>16) res += Math.min(len-16, 8)*3;
        if(len>24) res += (len-24)*4;
        return res;
    }
}