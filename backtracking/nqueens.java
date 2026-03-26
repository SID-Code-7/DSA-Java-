package backtracking;

public class nqueens {
    public static boolean isSafe(char board[][],int row ,int col){
        //upside check
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //digona; right
        for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][] , int row){

        //base case
        if(row == board.length){
            print(board);
            return;
        }
        //colums se check
        for(int col=0;col<board.length;col++){
        if(isSafe(board,row ,col)){
            //initalization
            board[row][col] ='Q';
            nQueens(board, row+1);
            board[row][col] = 'X';
        }
        }
    }
    public static void print(char board[][]){
        System.out.println("-------chess board--------");
        for(int i=0; i<board.length;i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0; i<board.length;i++){
            for(int j=0;j<board.length; j++){
                board[i][j]='X';
            }
        }
        nQueens(board, 0);
    }
}
