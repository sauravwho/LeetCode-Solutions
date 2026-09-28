class Solution {
    public int maxDepth(String s) {
        int currDepth = 0;
        int maxDepth = 0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                currDepth++;
                maxDepth = Math.max(currDepth, maxDepth);
            }
            else if(ch == ')'){
                currDepth--;
            }
        }
        return maxDepth;
    }
}