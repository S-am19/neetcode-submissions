class Solution {
    public String decodeString(String s) {
        ArrayDeque<Integer> num_stack = new ArrayDeque<>();
        ArrayDeque<String> char_stack = new ArrayDeque<>(); 
        //stores previous string values before [ isencountered
        int num = 0;
        String curr = "";
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch - '0');
            }
            else if(ch == '['){
                num_stack.push(num);
                char_stack.push(curr);

                num = 0;
                curr = "";
            }
            else if( ch == ']'){
                int repeat = num_stack.pop();
                String previous = char_stack.pop();

                StringBuilder temp = new StringBuilder(previous);
                for(int j = 0 ; j<repeat ; j++){
                    temp.append(curr);
                }
                curr = temp.toString();

            }else{
                curr += ch;
            }
        }

        return curr;
    }
}