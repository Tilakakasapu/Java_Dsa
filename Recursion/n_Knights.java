public class n_Knights{
    static int  knights(boolean[][] board,int row,int col,int targets){
        if(targets==0){
            display(board);
            return 1;
        }
        int count=0;
        if(col==board.length){
            return knights(board, row+1, 0, targets);
        }
        if(row >board.length-1||col > board.length-1){
            return 0;
        }
        if(issafe(board,row,col)){
            board[row][col] = true;
            count+=knights(board, row, col+1, targets-1);
            board[row][col] = false;
        }
        count+=knights(board, row, col+1, targets);
        return count;
    }
    static void display(boolean[][] board){
        for (boolean[] arr : board) {
            for (boolean bs : arr) {
                if(bs){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }
    static boolean issafe(boolean[][] board,int row,int col){
        if(isvalid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isvalid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isvalid(board,row+1,col-2)){
            if(board[row+1][col-2]){
                return false;
            }
        }
        if(isvalid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isvalid(board,row+2,col+1)){
            if(board[row+2][col+1]){
                return false;
            }
        }
        if(isvalid(board,row+2,col-1)){
            if(board[row+2][col-1]){
                return false;
            }
        }
        if(isvalid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isvalid(board,row+1,col+2)){
            if(board[row+1][col+2]){
                return false;
            }
        }
        return true;
    }
    static boolean isvalid(boolean[][] board,int row,int col){
        if(row>=0&&row<board.length&&col>=0&&col<board.length){
            return true;
        }
        else return false;
    }
    

    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, 10);
        System.out.println(knights(board, 0, 0, 6));
    }
}