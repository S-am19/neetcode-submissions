class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int r1 = word1.length() ;
        int r2 = word2.length() ;
        int l1 = 0 ;
        int l2 = 0;
        while( l1 < r1 && l2<r2){
            ans.append(word1.charAt(l1));
            ans.append(word2.charAt(l2));
            l1++;
            l2++;
        }
        while(l1 < r1){
             ans.append(word1.charAt(l1));
             l1++;
        }
        while(l2 < r2){
            ans.append(word2.charAt(l2));
            l2++;
        }
        return ans.toString();
    }
}