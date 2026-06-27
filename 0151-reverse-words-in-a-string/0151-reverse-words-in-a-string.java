class Solution {
    public String reverseWords(String s) {
        String[] w = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            result.append(w[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}