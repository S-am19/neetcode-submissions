class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        String str1 = new String(arr1);
        int wlen = s1.length();
        int l = 0;
        int r = wlen;
        while(r <= s2.length() && l < r){
            String window = s2.substring(l , r);
            char[] arr2 = window.toCharArray();
            Arrays.sort(arr2);
            String str2 = new String(arr2);
            if(str2.equals(str1)) return true;
            l++;
            r++;
        }
        return false;
    }
}
