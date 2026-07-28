class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = ""; 
        for(int i = 0 ; i<s.length() ; i++){
            if( (s.charAt(i) >= 97 && s.charAt(i) <=122) || (s.charAt(i) >=48 && s.charAt(i) <= 57) )
            str += s.charAt(i);
        }
        int r = str.length()-1;
        int l = 0;
        while(l < r){
            if(str.charAt(r) != str.charAt(l)) return false;
            l++;
            r--;
        }

        return true;
    }
}
