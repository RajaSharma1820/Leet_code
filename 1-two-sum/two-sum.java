class Solution {
    public int[] twoSum(int[] nums, int target) {
       int j=1;
       for(int i=0;i<nums.length-1;){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
            j++;
            if(j==nums.length){
                i++;
                j=i+1;
            }

       } 
       return new int[]{};
    }
}