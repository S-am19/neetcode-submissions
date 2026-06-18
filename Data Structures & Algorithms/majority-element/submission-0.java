//Using the Boyer Moore Voting Approach to find the max
class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                cand = num;
            }

            if(cand == num){
                count ++;
            }else{
                count --;
            }
        }
        return cand;
    }
}