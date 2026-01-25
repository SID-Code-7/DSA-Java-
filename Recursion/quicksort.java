package Recursion;

public class quicksort {
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quick(int arr[],int si,int ei){
        //base case 
        if(si>=ei){
            return;
        }
        int pidx = partition(arr,si,ei);
        quick(arr, si, pidx-1); //left
        quick(arr, pidx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1; //small element replacment
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,7,8,2};
        quick(arr, 0, arr.length-1);
        print(arr);
    }
}
