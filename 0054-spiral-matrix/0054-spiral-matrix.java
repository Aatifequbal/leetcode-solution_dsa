class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int startingRow = 0;
        int endingRow = m-1;
        int startingCol = 0;
        int endingCol = n-1;

        while(startingRow <= endingRow && startingCol <= endingCol){
            //row wise left to right -> starting print karta h, from starting to ending
            for(int col = startingCol; col<= endingCol; col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;
             //col wise top to bottom -> endimg print karta h, from startingRow to endingRow
             for(int row= startingRow; row<= endingRow; row++){
                result.add(matrix[row][endingCol]);
             }
             endingCol--;
             if(startingRow <= endingRow) {
                for(int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }
           
            
            if(startingCol <= endingCol){
                for(int row = endingRow; row >= startingRow; row--){
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
                
        }
        
     return result;

    } 
}