package Array.matrix;
public class spiralMatrix {
    public static void spiral(int matrix[][]){
        int sr=0;
        int sc =0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;

        while(sr <= er && sc <= ec){
            //top
            for(int j = sc; j<=ec; j++){
                System.out.print(matrix[sr][j]+" ");
            }
            //right
            for(int i =sr+1; i<=er; i++){
                System.out.print(matrix[i][ec]+" ");
            }
            //bottom
            for(int j =ec-1; j>=sc; j--){
                if(sr == er){
                    break;
                }
                System.out.print(matrix[er][j]+" ");
            }
            //left
            for(int i = er-1; i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(matrix[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(matrix);
    }
}
