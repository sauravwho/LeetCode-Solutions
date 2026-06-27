class Solution {
    public int reverse(int x) {
        long temp = 0;
        while(x != 0){
            int last = x%10;
            if(temp> Integer.MAX_VALUE/10 || temp<Integer.MIN_VALUE/10) return 0;
            temp = (temp*10)+ last;
            x = x/10;
        }
        return (int)temp;
    }
}