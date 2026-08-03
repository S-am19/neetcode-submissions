class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int l = 0;
        int r = people.length-1;

        while(l<=r){
            if(people[r] == limit){
               count++;
               r--;
            }else if(people[l]+people[r] > limit){
                count++;
                r--;
            }else if(people[l] + people[r] <= limit){
                count++;
                l++;
                r--;
            }

        }

        
        return count;
        
    }
}