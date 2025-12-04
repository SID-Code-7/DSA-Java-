 package Array;
 class largest{
    public static int large(int arr[]){
        int largest = arr[0];
        for( int i =0; i< arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {7,38,19,56,12};
        System.out.println(large(arr));
    }
 }