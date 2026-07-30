class KthLargest {
    private final PriorityQueue<Integer> resHeap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.resHeap = new PriorityQueue<>();
        for(int num:nums){
            add(num);
        }
    }
    public int add(int val) {
        resHeap.offer(val);
        if(resHeap.size() >k) resHeap.poll();
        return resHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */