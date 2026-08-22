class Solution {
    public void rotate(int[][] matrix) {
        // step1 : transpose
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                //swap method
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //step2: reverse row
        
        for(int row=0; row<n; row++){
            
            int startCol = 0;
            int endCol = n-1;
            while(startCol < endCol){
                int temp = matrix[row][startCol];
                matrix[row] [startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }

    }
}