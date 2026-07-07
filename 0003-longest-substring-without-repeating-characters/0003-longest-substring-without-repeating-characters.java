class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for(int i = 0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)&&map.get(curr) >= left){
                left = map.get(curr)+1;
            }
            map.put(curr, i);
            res = Math.max(res, i-left+1);
        }
        return res;
    }
}