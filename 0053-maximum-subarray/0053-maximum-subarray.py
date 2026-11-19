class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        currentsum =0
        max = nums[0]
        for i in range(len(nums)):
            currentsum+=nums[i]
            if(currentsum>max):
                max=currentsum
            if(currentsum<0):
                currentsum=0
        return max