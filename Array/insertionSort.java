package Array;

public class insertionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i =1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;

            while (prev>=0 && arr[prev]> curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }

        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,37,3,85,20,27};
        sort(arr);
    }
}
