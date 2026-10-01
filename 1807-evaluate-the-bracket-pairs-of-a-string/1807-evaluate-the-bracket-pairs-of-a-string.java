class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for(List<String> pair: knowledge){
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder res = new StringBuilder();
        int i = 0;
        int n = s.length();
        while(i<n){
            char ch = s.charAt(i);
            if(ch == '('){
                int j = s.indexOf(')',i+1);
                String key = s.substring(i+1, j);
                res.append(map.getOrDefault(key, "?"));
                i = j+1;
            }   else{
                res.append(ch);
                i++;
            }
        }
        return res.toString();
    }
}