public class NQueens {
    static int n_queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                count += n_queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean col : row) {
                if (col) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }

    static boolean issafe(boolean[][] board, int row, int col) {
        // check vertically
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int max_left = Math.min(row, col);
        for (int i = 1; i <= max_left; i++) {
            if (board[row - 1][col - 1]) {
                return false;
            }
        }
        int max_right = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= max_right; i++) {
            if (board[row - 1][col + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(n_queens(board, 0));
    }

}
