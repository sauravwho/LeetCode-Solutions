class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '1') ones++;
        }
        List<int[]> block = new ArrayList<>();
        int i = 0;
        while(i<n){
            int j = i;
            while(j<n && s.charAt(j) == s.charAt(i)){
                j++;
            }
            block.add(new int[]{s.charAt(i) -'0', j-i});
            i=j;
        }
        int gain =0;
        for(int k = 0; k<block.size(); k++){
            if(block.get(k)[0] == 1){
                if(k>0 && block.get(k-1)[0]==0 && k+1<block.size() && block.get(k+1)[0] == 0){
                    int left = block.get(k-1)[1];
                    int right = block.get(k+1)[1];
                    gain = Math.max(gain, left+right);
                }
            }
        }
        return ones+gain;
    }
}