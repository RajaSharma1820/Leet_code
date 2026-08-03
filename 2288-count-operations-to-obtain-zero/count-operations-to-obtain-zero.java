class Solution {
    public int countOperations(int num1, int num2) {
        int count =0,a=0,b=0;
        while(num1!=0 &&num2!=0){
            if(num1>=num2){
                a = num1-num2;
                num1=a;
            }
            else{
                b = num2-num1;
                num2=b;
            }
            count++;
        }
        return count;
    }
}