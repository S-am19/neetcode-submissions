class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int r = s.length()-1;
        int l = 0;
        while(l < r){
            while( l < r && !Character.isLetterOrDigit(s.charAt(l)))
            l++;
            while( l < r && !Character.isLetterOrDigit(s.charAt(r)))
            r--;

            if(s.charAt(r) != s.charAt(l)) return false;
            l++;
            r--;
        }

        return true;
    }
}
