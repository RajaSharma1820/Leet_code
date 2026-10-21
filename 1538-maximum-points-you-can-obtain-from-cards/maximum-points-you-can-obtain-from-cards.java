class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int right =0;
        int left =0;
        int max =0;
       for(int i=0;i<k;i++){
        right+=cardPoints[i];
       } 
       max = right;
       int index = cardPoints.length-1;
       for(int i=k-1;i>=0;i--){
        right-=cardPoints[i];
        left+=cardPoints[index];
        index--;
        max = Math.max(max,right+left);
       }
       return max;
    }
}