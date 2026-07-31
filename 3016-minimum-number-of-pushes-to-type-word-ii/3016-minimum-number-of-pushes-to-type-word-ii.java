class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        int res = 0;
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Integer[] freqArr = new Integer[26];
        for (int i = 0; i < 26; i++){
            freqArr[i] = freq[i];
        }
        Arrays.sort(freqArr, Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (freqArr[i] == 0) break;
            res += ((i / 8) + 1) * freqArr[i];
        }
        return res;
    }
}