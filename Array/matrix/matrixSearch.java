package Array.matrix;

public class matrixSearch {
    public static void search(int matrix[][],int key){
        // int n=matrix.length;

        //linear serach
        // boolean flag =false;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(matrix[i][j]==key){
        //             flag=true;
        //             break;
        //         }
        //     }
        // }
        // if(flag == true){
        //     System.out.println("found");
        // }

        //staircase search
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("("+row+","+col+")");
                break;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        search(matrix, key);
    }
}
