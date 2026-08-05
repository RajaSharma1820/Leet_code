class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=0){
                int temp = nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}