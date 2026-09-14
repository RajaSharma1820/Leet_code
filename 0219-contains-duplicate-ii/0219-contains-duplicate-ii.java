class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],i);
        }
        else{
            int pastindex = map.get(nums[i]);
            if(Math.abs(pastindex-i)<=k){
                return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
     }  
     return false; 
    }
}