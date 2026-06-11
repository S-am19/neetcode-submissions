class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer , Integer> list = new HashMap<>();
        for(int i : nums){
              if(list.containsKey(i)){
                return true;
            }
            list.put(i , 1);
        }
        return false;
    }
}