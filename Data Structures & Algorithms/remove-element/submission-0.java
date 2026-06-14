class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        int l1 = nums.length;
        for(int i : nums ){
            if(i != val){
                list.add(i);
            }
        }
        int l2 = list.size();
        int i;
        for(i= 0;i<l2; i++){
            nums[i] = list.get(i);
        }
        
        for(int j = i;j<l1;j++){
            nums[j] = 0;
        }
        int k = l2;
        return k;
    }
}