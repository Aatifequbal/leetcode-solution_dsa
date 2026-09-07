class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int stRow = 0;
        int endRow = m-1;
        int stCol = 0;
        int endCol = n-1;

        while(stRow <= endRow && stCol <=  endCol){
            for(int col=stCol; col<=endCol; col++){
                result.add(matrix[stRow][col]);
            }
            stRow++;

            for(int row= stRow; row<=endRow; row++){
                result.add(matrix[row][endCol]);
            }
            endCol--;

            if(stRow <= endRow){
                for(int col=endCol; col>=stCol; col--){
                    result.add(matrix[endRow][col]);
                }
                endRow--;
            }
            
            if(stCol <= endCol){
                for(int row=endRow; row>=stRow; row--){
                    result.add(matrix[row][stCol]);
                }
                stCol++;
            }  
            
        }

        return result;
    }
}