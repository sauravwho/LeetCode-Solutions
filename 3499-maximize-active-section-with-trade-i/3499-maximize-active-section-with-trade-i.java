class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        int currZero = 0;
        int prevZero = 0;
        int gain = 0;
        for(char c:s.toCharArray()){
            if(c=='0') currZero++;
            else{
                if(currZero!=0) prevZero = currZero;
                currZero = 0;
                ones++;
            }
            gain = Math.max(gain, currZero+prevZero);
        }
        if(gain == currZero || gain == prevZero) return ones;
        return ones+gain;
    }
}