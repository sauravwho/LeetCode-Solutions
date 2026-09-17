class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String t: tokens){
            if(isOperator(t)){
                int b = stack.pop();
                int a = stack.pop();
                int res = applyOperator(t, a, b);
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
    private boolean isOperator(String t){
        return t.equals("+") || t.equals("-") ||  t.equals("*") || t.equals("/");
    }
    private int applyOperator(String t, int a, int b){
        switch(t){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Invalid operator: "+t);
        }
    }
}