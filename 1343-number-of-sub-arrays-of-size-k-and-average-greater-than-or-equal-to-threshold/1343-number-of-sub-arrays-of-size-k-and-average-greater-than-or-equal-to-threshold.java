class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int subarray = 0;
        int sum =0;
        int count=0;
        int average =0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
            average = sum/k;
            if(average>=threshold){
                count++;
            }
        for(int i=1;i<arr.length-k+1;i++){
          sum=sum-arr[i-1]+arr[i+k-1];
          average= sum/k;
          if(average>=threshold){
            count++;
          }
        }
        return count;
    }
}