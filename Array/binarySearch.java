package Array;

public class binarySearch {
    public static int search(int arr[], int key){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end = mid -1;
            }
            else{
                start= mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int key =11;
        System.out.println("the index is : "+search(arr,key));
    }
}
