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

        // int[] freq = new int[26];
        // int res = 0;
        // for (char c : word.toCharArray()) {
        //     freq[c - 'a']++;
        // }
        // Arrays.sort(freq);
        // for (int i = 25; i>=0; i--) {
        //     if (freq[i] == 0) break;
        //     // res += (((25-i) / 8) + 1) * freq[i];
        //     res += ((33-i)/8) * freq[i];
        // }
        // return res;
    }
}