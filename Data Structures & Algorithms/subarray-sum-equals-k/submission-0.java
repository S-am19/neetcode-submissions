class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0 ,1);  // sum 0 occured once
        for(int i = 0 ; i<nums.length ;i++){
            sum += nums[i];
            int target = sum-k;
            if(map.containsKey(target)){
                count+= map.get(target);
            }
            map.put(sum, map.getOrDefault(sum , 0) + 1);
        }
        return count;
        
    }
}