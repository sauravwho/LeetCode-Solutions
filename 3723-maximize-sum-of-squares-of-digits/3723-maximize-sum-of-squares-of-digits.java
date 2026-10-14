class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum <1 || sum>9*num) return "";
        StringBuilder sb = new StringBuilder();
        int count = sum/9;
        int rem = sum%9;
        for(int i =0; i<count; i++){
            sb.append('9');
        }
        if(rem>0){
            sb.append(rem);
        }
        int dig = count+(rem>0?1:0);
        int zeros = num-dig;
        for(int i = 0; i<zeros; i++){
            sb.append('0');
        }
        return sb.toString();
    }
}