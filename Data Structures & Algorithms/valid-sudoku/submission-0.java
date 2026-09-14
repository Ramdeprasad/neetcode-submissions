class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row check
        for (int row=0; row<9; row++) {
            int[] checker = new int[10];
            for(int col=0; col<9; col++) {
                if(board[row][col] != '.') {
                    int val = Character.getNumericValue(board[row][col]);
                    if(checker[val] == 1) {
                        return false;
                    }
                    checker[val] = 1;
                }
            }
        }

        // col check
        for(int col=0; col<9; col++) {
            int[] checker = new int[10];
            for (int row=0; row<9; row++) {
                if(board[row][col] != '.') {
                    int val = Character.getNumericValue(board[row][col]);
                    if(checker[val] == 1) {
                        return false;
                    }
                    checker[val] = 1;
                }
            }
        }

        // square check
        for(int k=0; k<9; k++) {
            int[] checker = new int[10];
            for (int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    int row = (k/3)*3+i;
                    int col = (k%3)*3+j;
                    if(board[row][col] != '.') {
                        int val = Character.getNumericValue(board[row][col]);
                        if(checker[val] == 1) {
                            return false;
                        }
                        checker[val] = 1;
                    }
                }
            }
        }
        return true;
    }
}
