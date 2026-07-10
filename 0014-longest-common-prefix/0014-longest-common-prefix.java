class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String resStr = strs[0];
        for (int i = 0; i<resStr.length(); i++){
            char c = resStr.charAt(i);
            for (int j = 1; j<strs.length; j++){
                if(i==strs[j].length() || strs[j].charAt(i)!= c){
                    return resStr.substring(0,i);
                }
            }
        }
        return resStr;
    }
}