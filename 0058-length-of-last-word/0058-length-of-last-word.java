class Solution {
    public int lengthOfLastWord(String s) {
       s = s.trim();
        int count = 0;
        for (int i= s.lastIndexOf(" ")+1; i<s.length(); i++){
            count++;
        }
        return count;
    }
}