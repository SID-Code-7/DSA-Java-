package Array.matrix;

public class transpose {
    public static void printing(int mat[][]){
        for(int i=0; i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=2,col=3;
        int arr[][] ={{2,5,9},{10,8,4}};
        printing(arr);
        System.out.println();
        int trans[][] = new int[col][row];

        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]=arr[i][j];
            }
        }
        printing(trans);
    }
}
