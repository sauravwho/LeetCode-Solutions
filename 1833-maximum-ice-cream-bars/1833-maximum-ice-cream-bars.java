class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int n : costs){
            if(coins < n) 
                break;
            count++;
            coins -= n;
        }
        return count;
    }
}