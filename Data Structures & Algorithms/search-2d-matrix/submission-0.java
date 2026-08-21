class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = n;
        int rc = 0;
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j< n; j++){
                if(matrix[i][j] ==  target){
                    return true;
                }
            }
        }

    return false;
        
    }
}
