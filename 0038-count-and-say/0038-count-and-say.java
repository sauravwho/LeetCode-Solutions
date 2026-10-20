class Solution {
    public String countAndSay(int n) {
        if(n<=0) return "";
        String res = "1";
        for(int i = 2; i <=n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            for(int j = 0; j<res.length(); j++) {
                if(j+1 <res.length() && res.charAt(j)==res.charAt(j+1)) {
                    count++;
                }else {
                    next.append(count).append(res.charAt(j));
                    count = 1;
                }
            }
            res = next.toString();
        }
        return res;
    }
}