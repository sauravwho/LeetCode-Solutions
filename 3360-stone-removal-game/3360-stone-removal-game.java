class Solution {
    public boolean canAliceWin(int n) {
        int stone = 10;
        boolean aliceTurn = true;
        while(n>=stone){
            n -= stone;
            stone--;
            aliceTurn = !aliceTurn;
        }
        return !aliceTurn;
    }
}