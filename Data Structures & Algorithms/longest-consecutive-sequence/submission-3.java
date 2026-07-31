class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
      for(int i: nums){
       set.add(i);
      }
      int count = 0;
      for(int i : nums){
        if(!set.contains(i-1)){
            int l = 1;
            while (set.contains(i + l)) {
                    l++;
                    
                }
            count = Math.max(l,count);
        }
      }

 return count;
      
    }
}
