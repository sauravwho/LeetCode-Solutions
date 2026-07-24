class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateResult(res, new StringBuilder(), 0, 0, n);
        return res;
    }
    private void generateResult(List<String> result, StringBuilder curr, int left, int right, int n){
        if(curr.length()==2*n){
            result.add(curr.toString());
            return;
        }
        if(left<n){
            curr.append('(');
            generateResult(result, curr, left+1, right, n);
            curr.deleteCharAt(curr.length()-1);
        }
        if(right<left){
            curr.append(')');
            generateResult(result, curr, left, right+1, n);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}