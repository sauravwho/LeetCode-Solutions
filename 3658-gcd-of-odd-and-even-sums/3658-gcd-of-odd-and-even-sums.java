class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1;i<=n*2; i++){
            if(i%2==0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }
        return getGCD(sumOdd, sumEven);
    }
    public int getGCD(int sumOdd, int sumEven){
        return sumEven==0?sumOdd:getGCD(sumEven, sumOdd%sumEven);
    }
}