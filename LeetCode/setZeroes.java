//https://leetcode.com/problems/set-matrix-zeroes
public class setZeroes {
    public void setzeroes(int[][] matrix) {
        int[][] demo= new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                demo[i][j]=matrix[i][j];
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    set(demo, i, j);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=demo[i][j];
            }
        }
    }
    public void set(int[][] demo, int row, int col){
        for(int i=0; i<demo.length; i++){
            demo[i][col]=0;
        }
        for(int j=0; j<demo[0].length; j++){
            demo[row][j]=0;
        }
    }
}
