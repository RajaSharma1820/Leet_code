class Solution {
    public int reverse(int x) {
        int b = x;
        if(x<0){
            x = x*(-1);
        }
        int reverse = 0;
        while(x>0){
            int a = x%10;
             if (reverse > Integer.MAX_VALUE / 10) {
                return 0;
            }
            reverse=(reverse*10)+a;
            x=x/10;
        }
        if(b<0){
            reverse=reverse*(-1);
        }
        return reverse;
    }
}