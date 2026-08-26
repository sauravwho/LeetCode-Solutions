class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int one = 0;
        int left = 0;
        String res = "";
        for(int right = 0; right<n; right++){
            if(s.charAt(right)=='1')    one++;
            while(one == k){
                while(s.charAt(left)=='0')  left++;
                String curr = s.substring(left, right+1);
                if(res.isEmpty() || curr.length()<res.length() || (curr.length()==res.length() && curr.compareTo(res)<0)) res = curr;
                if(s.charAt(left)=='1') one--;
                left++;
            }
        }
        return res;
    }
}