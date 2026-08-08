class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int maxf= 0;
        int[] hash = new int[26];
        for(int i = 0; i<26 ; i++) hash[i]= 0;
        while( r< s.length()){
            hash[s.charAt(r) - 'A'] ++;
             maxf = Math.max( hash[s.charAt(r) - 'A'], maxf);
             if((r-l+1) - maxf > k){
                hash[s.charAt(l) - 'A']--;
                l++;
             }
            maxlen = Math.max(r-l+1 , maxlen);
            r++;
        }

        return maxlen;
     
    }
}