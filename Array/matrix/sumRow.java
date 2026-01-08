package Array.matrix;

public class sumRow {
    public static int suming(int arr[][]){
        int sum=0;
        //my first thinking
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0; j<arr[0].length;j++){
        //         if(i==1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }

        //optimal

        for(int j=0;j<arr[0].length;j++){
            sum+=arr[1][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.print(suming(arr));
    }
}
