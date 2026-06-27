class Solution {
    public void reverseString(char[] s) {
        int p = 0;
        int n = s.length-1;
        while (p < n){
            char temp = s[p];
            s[p] = s[n];
            s[n] = temp;
            p++;
            n--;
        }
    }
}