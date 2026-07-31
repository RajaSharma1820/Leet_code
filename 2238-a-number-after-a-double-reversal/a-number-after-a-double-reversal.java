class Solution {
    public boolean isSameAfterReversals(int num) {
        int b = num;
        int reverse =0;
        for(int i=0;i<2;i++){
        reverse = 0;
        while(num>0){
            int a = num%10;
            reverse = (reverse*10)+a;
            num=num/10;
            }
            num=reverse;
        }
        if(reverse==b){
            return true;
        }
        else{
            return false;
        }
    }
}