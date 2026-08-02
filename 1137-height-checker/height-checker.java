class Solution {
    public int heightChecker(int[] arr) {
        int[] brr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
       for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

       }
       int count =0;
       for(int i=0;i<brr.length;i++){
        if(arr[i]!=brr[i]){
            count++;
        }
       } 
       return count;
    }
}