class Solution {
    public int reverse(int x) {
        int a = x;
        if(x<0){
            x*=(-1);
        }
        int reverse =0;
        while(x>0){
            int b= x%10;
            if(reverse>Integer.MAX_VALUE/10){
                return 0;
            }
            reverse = (reverse*10)+b;
            x=x/10;
        }
        if(a<0){
            reverse*=(-1);
        }
        return reverse;
    }
}