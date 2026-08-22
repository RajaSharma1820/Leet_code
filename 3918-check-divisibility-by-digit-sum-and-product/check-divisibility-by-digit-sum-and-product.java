class Solution {
    public boolean checkDivisibility(int n) {
      int a =n;
      int sum =0;
      int product =1;
      while(a!=0){
        int temp = a%10;
        sum+=temp;
        product*=temp;
        a=a/10;
      }  
      return n%(product+sum)==0;
    }
}