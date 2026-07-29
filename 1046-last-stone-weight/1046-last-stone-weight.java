class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> resHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            resHeap.add(stone);
        }
        while(resHeap.size()>1){
            int x = resHeap.poll();
            int y = resHeap.poll();
            if(y != x){
                resHeap.add(x-y);
            }
        }
        return resHeap.isEmpty()?0:resHeap.peek();
    }
}