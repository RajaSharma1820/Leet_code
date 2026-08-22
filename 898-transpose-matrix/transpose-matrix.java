class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] newmatrix = new int[matrix[0].length][matrix.length];
       for(int i=0;i<newmatrix.length;i++){
        for(int j=0;j<newmatrix[0].length;j++){
         newmatrix[i][j]=matrix[j][i];
        }
       } 
       return newmatrix;
    }
}