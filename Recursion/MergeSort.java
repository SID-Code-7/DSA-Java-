package Recursion;

public class MergeSort {
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //merge sort
    public static void mergesort(int arr[],int si,int ei){
        //base case 
        if(si>=ei){
            return;
        }

        //kaam
        int mid = si+(ei-si)/2;
        mergesort(arr, si, mid); //left part
        mergesort(arr, mid+1, ei); //right part

        merge(arr,si,mid,ei);
    }

    //mergse arr
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterartor for left side
        int j = mid+1; //iterator for right side
        int k =0 ; //iterator for temp

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left
            while (i<=mid) {
                temp[k++]=arr[i++];
            }
            //right part
            while (j<=ei) {
                temp[k++]=arr[j++];
            }

            //copy temp to og arr
            for( k=0,i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,49,21,29,9,4};
        mergesort(arr, 0, arr.length-1);
        print(arr);
    }
}
