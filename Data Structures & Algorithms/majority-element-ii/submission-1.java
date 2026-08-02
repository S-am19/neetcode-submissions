class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int count1 = 0;
        int count2 = 0;
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(count1==0 && num != c2){
                c1 = num;
            }else if(count2 == 0 && num!=c1){
                c2 = num;
            }

            if(c1==num){
                count1++;
            }else if(c2 == num){
            count2++;
        }else{
            count1--;
            count2--;
        }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == c1) count1++;
            if(num == c2) count2++;
        }
        int min = nums.length /3;
        if(count1 > min) list.add(c1);
        if(count2 > min) list.add(c2);
    
 return list;

    }
}