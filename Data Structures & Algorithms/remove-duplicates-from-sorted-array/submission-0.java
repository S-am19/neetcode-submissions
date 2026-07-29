class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        for(int i = 0 ; i< list.size(); i++)
        nums[i] = list.get(i);
        return  list.size();
    }
}