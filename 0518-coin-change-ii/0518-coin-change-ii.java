class Solution {
    public int change(int amount, int[] coins) {
        int[] com = new int[amount+1];
        com[0] = 1;
        for(int coin: coins){
            for(int i = coin; i<=amount; i++){
                com[i] += com[i-coin];
            }
        }
        return com[amount];
    }
}