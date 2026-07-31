class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];

                // Skip empty cells denoted by '.'
                if (ch == '.') {
                    continue;
                }

                // Convert char digit ('1'-'9') to index 0-8
                int num = ch - '1';

                // Map 2D cell coordinate (r, c) to 3x3 sub-box index (0 to 8)
                int boxIndex = (r / 3) * 3 + (c / 3);

                // If the number was already seen in current row, column, or sub-box
                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // Mark number as seen in row, column, and sub-box
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}
