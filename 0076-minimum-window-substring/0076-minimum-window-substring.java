class Solution {
    public String minWindow(String s, String t) {
        if(s.length() <t.length())  return "";
        int[] count = new int[128];
        for(char c : t.toCharArray())   count[c]++;
        int required = t.length();
        int best = -1;
        int min = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0; right<s.length(); right++){
            char rightChar = s.charAt(right);
            if(count[rightChar]>0)  required--;
            count[rightChar]--;
            while(required == 0){
                if(right-left+1 < min){
                    min = right-left+1;
                    best = left;
                }
                char leftChar = s.charAt(left);
                count[leftChar]++;
                if(count[leftChar]>0){
                    required++;
                }
                left++;
            }
        }
        return best == -1? "" :s.substring(best, best+min);
    }
}