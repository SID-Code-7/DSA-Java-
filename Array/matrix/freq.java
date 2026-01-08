package Array.matrix;

public class freq {
    public static int counting(int arr[][]){
        int count=0;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        System.out.print(counting(arr));
    }
}
