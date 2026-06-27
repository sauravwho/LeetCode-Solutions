class Solution {
    public void reverseString(char[] s) {
        StringBuffer sb = new StringBuffer(String.valueOf(s));
        sb.reverse();
        for (int i = 0 ; i < s.length ; i++) {
                s[i] = sb.charAt(i);
        }
        System.out.println(Arrays.toString(s));
    }
}