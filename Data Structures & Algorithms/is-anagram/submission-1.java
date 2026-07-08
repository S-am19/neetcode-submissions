class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else{
            int n = s.length();
            char[] sa = s.toCharArray();
            char[] ta = t.toCharArray();
            boolean[] isValid = new boolean[n];
            for(int i = 0;i<n ;i++){
                isValid[i] = false;
            }
            for(int i = 0 ;i< n; i++){
                for( int j = 0 ;j< n;j++){
                    if(ta[i] == sa[j]){
                        if(isValid[j] == false){
                            isValid[j] = true;
                            break;
                        }
                    }

                }
            }
            for(int i = 0 ;i<n;i++){
                if(isValid[i] == false){
                    return false;
                }
            }
            return true;
        }
        
    }
}