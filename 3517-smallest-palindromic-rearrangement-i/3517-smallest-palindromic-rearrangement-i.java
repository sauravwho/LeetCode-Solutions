public class Solution {
    public String smallestPalindrome(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int oddCount = 0;
        char oddChar = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
                oddChar = (char) (i + 'a');
            }
        }
        if (oddCount > 1) {
            return "";
        }
        StringBuilder leftHalf = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i] / 2; j++) {
                leftHalf.append((char) (i + 'a'));
            }
        }
        StringBuilder res = new StringBuilder(leftHalf);
        if (oddCount == 1) {
            res.append(oddChar);
        }
        res.append(leftHalf.reverse());
        return res.toString();
    }
}