class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(board[row][col]=='.')continue;
                int value=board[row][col];
                int box=(row/3)*3+(col/3);
                 if (!set.add(value + "row" + row) ||
                    !set.add(value + "col" + col) ||
                    !set.add(value + "box" + box)) {
                    return false;
                }
            }
        }
        return true;
    }
}
