package Array;

public class Selectionsort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            int min =i;
            for(int j =i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }

            int temp =arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
     int arr[] = {1,8,5,7,2,4};
     sort(arr);
    }
}
