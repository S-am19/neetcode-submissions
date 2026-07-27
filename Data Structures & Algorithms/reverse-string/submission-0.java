class Solution {
    public void reverseString(char[] s) {
        for(int i = 0 ; i < s.length / 2;i++ ){
            int k = s.length - i-1;
            char temp = s[i];
            s[i] = s[k];
            s[k] = temp;
        }
    }
}