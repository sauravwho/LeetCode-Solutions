class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){
            if(c == '('|| c == '{'|| c == '['){
              stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                char a = stack.pop();
                if(a !='(' && c==')'||a !='[' && c==']'||a !='{' && c=='}') return false;
            }
        }
        return stack.isEmpty();
    }
}


        // HashMap<Character, Character> map = new HashMap<>();
        // map.put('}', '{');
        // map.put(')', '(');
        // map.put(']', '[');

        // Stack<Character> stack = new Stack<>();
        // for(int i = 0; i<s.length(); i++){
        //     char c = s.charAt(i);
        //     if(map.containsKey(c)){
        //         char e = stack.isEmpty()? '#' : stack.pop();
        //         if(e != map.get(c)){
        //             return false;
        //         }
        //     }
        //     else{
        //         stack.push(c);
        //     }
        // }
        // return stack.isEmpty();
//     }
// }