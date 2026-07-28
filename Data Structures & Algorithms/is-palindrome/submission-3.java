class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            char left = s.charAt(l);
            char right = s.charAt(r);

            if(!((left >= 'a' && left <= 'z') || (left >= '0' && left <= '9') || 
            ( left >= 'A' && left <= 'Z'))){
                l++;
                continue;
            } 
            if(!((right >= 'a' && right <= 'z') || (right >= '0' && right <= '9') || 
             ( right >= 'A' && right <= 'Z') )){
                r--;
                continue;
            } 
            if( Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }
            l++;
            r--;
           }

        return true;
    }
}