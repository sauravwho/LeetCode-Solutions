class Solution {
    public int minChanges(String s) {
        int res = 0;
        // for(int i = 0; i<s.length(); i+=2){
        //     if(s.charAt(i)!= s.charAt(i+1)) res++;
        // }

        int len = s.length();
         for(int i = 0; i<len; i+=2){
            int l = s.charAt(i);
            int r = s.charAt(i+1);
            if(l!= r)   res++;
         }
        return res;
    }
}