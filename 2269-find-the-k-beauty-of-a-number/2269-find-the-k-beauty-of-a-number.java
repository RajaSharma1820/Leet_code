class Solution {
    public int divisorSubstrings(int num, int k) {
      String s = String.valueOf(num);
      int count =0;
      int window = Integer.parseInt(s.substring(0,k));
      if(window!=0&& num%window==0){
        count++;
      }
    for(int i=k;i<s.length();i++){
        window = Integer.parseInt(s.substring(i-k+1,i+1));
        if(window!=0 && num%window==0){
            count++;
        }
    }
    return count;
    }
}