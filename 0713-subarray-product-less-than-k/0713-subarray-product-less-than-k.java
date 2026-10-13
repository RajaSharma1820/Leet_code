class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int count =0;
        int product =1;
        if(k<=1){
            return 0;
        }
        while(i<nums.length){
            product*=nums[i];
            i++;
            while(product>=k){
                product/=nums[j];
                j++;
            }
            count +=i-j;
        }
        return count;
    }
}