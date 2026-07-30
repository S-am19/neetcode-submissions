class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-3 ;i++){
             if (i > 0 && nums[i] == nums[i - 1]) {
             continue;
            }
           long t2 = (long) target - nums[i];
            for(int j = i+1 ; j < nums.length-2 ; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                     continue;
                }
                int l = j+1;
                int r = nums.length -1;
                long t3 = t2 - nums[j];
                while(l < r){
                    if(nums[l] + nums[r] == t3){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[l]);
                    res.add(nums[r]);
                    ans.add(res);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    while (l < r && nums[r] == nums[r + 1]) {
                         r--;
                    }
                    }else if(nums[l] + nums[r] < t3){
                        l++;
                    }else{
                        r--;
                    }
                }

            }
        }
        return ans;
    }
}