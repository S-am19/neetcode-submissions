class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] arr1 = new int[26];
        for(int i = 0 ; i<s1.length() ; i++){
            char c = s1.charAt(i);
            arr1[c-'a']++;
        }
        
        int l = 0;
        int wlen = s1.length();
        int r = wlen;
        int[] arr2 = new int[26];

        for(int i = l ; i<l+wlen ;i++){
                char c = s2.charAt(i);
                arr2[c-'a']++;
            }

        if(Arrays.equals(arr1, arr2)) return true;   

        for( r = wlen ; r < s2.length() ; r++){

            arr2[s2.charAt(l)-'a']--;
            l++;
            arr2[s2.charAt(r) - 'a']++;
            if(Arrays.equals(arr1, arr2)) return true;
        }
        
        return false;
    }
}
