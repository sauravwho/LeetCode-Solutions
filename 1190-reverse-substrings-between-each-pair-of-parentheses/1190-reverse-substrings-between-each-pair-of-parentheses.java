class Solution {
    public String reverseParentheses(String s) {
        Deque<StringBuilder> stack = new ArrayDeque<>();
        stack.push(new StringBuilder());
        for(char ch: s.toCharArray()){
            if(ch == '('){
                stack.push(new StringBuilder());
            }
            else if(ch == ')'){
                StringBuilder curr = stack.pop();
                curr.reverse();
                stack.peek().append(curr);
            }
            else{
                stack.peek().append(ch);
            }
        }       
        return stack.pop().toString();
    }
}