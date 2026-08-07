class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        while( r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                max = Math.max(r-l+1,max);
                r++;
            }else{
                while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
                }
                set.add(s.charAt(r));
                max = Math.max(r-l+1,max);
                r++;
            }
        }
    return max;
    }
}