class Solution {
    public int totalNumbers(int[] digits) {
        int[] available = new int[10];
        for(int d:digits)   available[d]++;
        int count = 0;
        for(int i = 100; i<= 998; i+=2){
            int d1 = i/100;
            int d2 = (i/10)%10;
            int d3 = i%10;
            int[] req = new int[10];
            req[d1]++;
            req[d2]++;
            req[d3]++;
            if(available[d1]>= req[d1] && available[d2]>= req[d2] && available[d3] >= req[d3]){
                count++;
            }
        }
        return count;
    }
}