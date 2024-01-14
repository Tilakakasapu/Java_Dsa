public class Sudoku_solver {
    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean noemptyleft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    noemptyleft = false;
                    break;
                }
            }
            if (!noemptyleft) {
                break;
            }
        }
        if (noemptyleft) {
            return true;
        }
        for (int i = 1; i <= 9; i++) {
            if (issafe(board, row, col, i)) {
                board[row][col] = i;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;

    }

    static boolean issafe(int[][] board, int row, int col, int number) {
       for(int i=0;i<board.length;i++){
         if(board[row][i]== number){
            return false;
         }
       }
       for (int[] nums : board) {
        if(nums[col]==number){
            return false;
        }
       }
        int strt = (int)(Math.sqrt(board.length));
        int start = row - row%strt;
        int col_start = col- col%strt;
        for(int i = start;i<start+strt;i++){
            for(int j = col_start;j<col_start+strt;j++){
                if(board[i][j]==number){
                    return false;
                }
            }
        }
        return true;
    }
static void display(int[][] board){
    for (int[] row : board) {
        for (int num  : row) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {

        int[][] board = new int[][] {
            {3, 1, 6, 5, 7, 8, 4, 9, 2},
            {5, 2, 0, 0, 3, 0, 7, 6, 8},
            {4, 8, 7, 6, 2, 9, 5, 3, 1},
            {2, 6, 3, 4, 1, 5, 9, 8, 7},
            {9, 7, 4, 8, 0, 3, 1, 2, 5},
            {8, 5, 1, 7, 9, 2, 6, 4, 3},
            {1, 3, 2, 9, 4, 7, 8, 5, 6},
            {6, 9, 8, 3, 5, 1, 2, 7, 4},
            {7, 4, 5, 2, 8, 6, 3, 1, 9}
        };
        
            if(solve(board)){
                display(board);
            }
            else{
                System.out.println("it acnnot be solved");
            }

    }
}
