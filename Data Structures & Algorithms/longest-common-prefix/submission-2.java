class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        int n = strs.length;
        String last = strs[n-1];
        String first = strs[0];
        int i = 0;
        while( i < first.length() && first.charAt(i) == last.charAt(i) ){
            ans += first.charAt(i);
            i++;
        }
        return ans;
    }
}