class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i= 0 ; i<9 ;i++){
        boolean[] valid = new boolean[9];
        for(int k = 0 ; k<9 ; k++) valid[k] = false;
           for(int j = 0 ; j < 9 ;j++){
                if(board[i][j] != '.'){
                    if(!valid[Character.getNumericValue(board[i][j]) -1])
                    valid[Character.getNumericValue(board[i][j])-1] = true;
                    else
                    return false;
                }
           }
           boolean[] validC = new boolean[9];
           for(int k = 0 ; k<9 ; k++) validC[k] = false;
            for(int j = 0 ; j < 9; j++){
                if(board[j][i] != '.'){
                    if(!validC[Character.getNumericValue(board[j][i])-1])
                    validC[Character.getNumericValue(board[j][i])-1] = true;
                    else
                    return false;
                }
           }
        }
        for(int row = 0 ; row<9; row+=3){
            for(int col = 0 ; col<9 ; col+=3){
                int i =0;
                boolean[] validC = new boolean[9];
                while( i<3 ){
                    int j = 0;
                    while(j<3){
                    if(board[row+i][col+j] != '.'){
                    if(!validC[Character.getNumericValue(board[row+i][col+j]) - 1])
                    validC[Character.getNumericValue(board[row+i][col+j])-1] = true;
                    else
                    return false;
                }
                j++;
                }
                i++;
                }

            }
        }
return true;
    }
}
