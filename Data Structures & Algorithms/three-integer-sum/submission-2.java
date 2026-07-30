class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
             continue;
            }
            int l = i+1;
            int r = nums.length - 1;
            int target = 0-nums[i];
            while(l<r){
                if(nums[l] + nums[r] == target){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
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
                }else if(nums[l] + nums[r] < target){
                        l++;
                }else{
                        r--;
                    }

                }
            }
             return ans;
        }
       
    }
