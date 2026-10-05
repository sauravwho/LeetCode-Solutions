class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for(char ch:s.toCharArray()){
            if(ch == '('){
                stack.push(0);
            }
            else{
                int inScore = stack.pop();
                int outScore = stack.pop();
                int curr = outScore+Math.max(2*inScore, 1);
                stack.push(curr);
            }
        }
        return stack.pop();
    }
}