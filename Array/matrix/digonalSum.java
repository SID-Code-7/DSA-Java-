package Array.matrix;
public class digonalSum {
    public static int digsum(int matrix[][]){
        //brute force
        int n=matrix.length;
        int sum=0;
        // for(int i=0; i<n;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j == n-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        //optimize

        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
            if(i != n-1-i){   //because in odd nxn there will be some common element in middle
                sum+=matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print(digsum(matrix));
    }
}
