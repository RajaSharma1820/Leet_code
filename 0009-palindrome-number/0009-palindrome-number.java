class Solution {
    public boolean isPalindrome(int x) {
       int a = x; 
       int reverse =0;
       while(a>0){
        int temp =a%10;
        reverse = reverse*10+temp;
        a=a/10;
       }
       return reverse==x;
    }
}