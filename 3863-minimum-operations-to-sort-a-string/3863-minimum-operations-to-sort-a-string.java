class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if(n <=1) return 0;
        boolean isSorted = true;
        char minCh = s.charAt(0);
        char maxCh = s.charAt(0);
        for(int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            if(i>0 && ch< s.charAt(i-1)) {
                isSorted = false;
            }
            if(ch<minCh) minCh = ch;
            if(ch>maxCh) maxCh = ch;
        }
        if(isSorted) return 0;
        if(n==2) return -1;
        char first = s.charAt(0);
        char last = s.charAt(n-1);
        if(first == minCh || last == maxCh)    return 1;
        for(int i = 1; i< n-1; i++) {
            char ch = s.charAt(i);
            if(ch==minCh || ch==maxCh) {
                return 2;
            }
        }
        return 3;
    }
}