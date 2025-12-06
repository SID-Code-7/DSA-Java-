package Array;
public class subarray {
    public static  void printSubarr(int arr[]){
        for(int i =0; i<arr.length;i++){
            int start =i;
            int total =0;
            for(int j =i; j<arr.length; j++){
                int sum =0;
                int end =j;
                for(int k =start ; k<=end; k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println(" sum is "+sum);
                total+=sum;
            }
            System.out.println(" total subarray sum is = "+total);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
    printSubarr(arr);
    }
}
