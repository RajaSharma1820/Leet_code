class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rota(nums,0,nums.length-1);
        rota(nums,0,k-1);
        rota(nums,k,nums.length-1);
    }
    public static void rota(int[] arr,int a,int b){
        while(a<b){
            int temp =arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}