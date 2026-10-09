class Solution {
    public int minInsertions(String s) {
        int ins = 0;
        int count = 0;
        int i = 0;
        int n = s.length();
        while(i<n){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                i++;
           }
           else{
            if(i+1<n && s.charAt(i+1) == ')'){
                i+=2;
            }
            else{
                ins++;
                i++;
            }
            if(count>0){
                count--;
            }
            else{
                ins++;
            }
           }
        }
        return ins+(count*2);
    }
}