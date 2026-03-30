package backtracking;

public class practice {
    public static boolean isSafe(char board[][] , int row ,int col){
        //up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //dig left
        for(int i=row-1, j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //dig right
        for(int i=row-1,j=col+1 ; i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueens(char board[][], int row){
        //base case 
        if(row == board.length){
            // print(board);
            count++;
            return;
        }
        //kaam
        //column se check
        for(int col=0; col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] ='Q';
                nqueens(board, row+1);
                board[row][col] = 'X';
            }
        }
        
    }
    static int count=0;
    public static void print(char [][]board){
        System.out.println("----chess board----");
        for(int i=0;i<board.length;i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //nqueens
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0; j<board.length;j++){
                board[i][j]='X';
            }
        }
        nqueens(board,0);
        System.out.print("total ways = "+count);
    }
}
