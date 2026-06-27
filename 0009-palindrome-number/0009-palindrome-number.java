class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;   
        }
        else{
            int n = x;
            int temp = 0;
            while(x!=0){
                temp = (temp*10)+x%10;
                x /=10;
            }
            return temp == n;
        }
        
    }
}