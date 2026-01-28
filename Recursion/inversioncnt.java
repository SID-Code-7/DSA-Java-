package Recursion;

public class inversioncnt {
    //brute force approch
    // public static int inv(int arr[]){
    //     int n=arr.length;
    //     int invcnt=0;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]>arr[j]){
    //                 invcnt++;
    //             }
    //         }
    //     }
    //     return invcnt;
    // }

    //optimal using modifiy merge sort
    public static int mergesort(int arr[],int si,int ei){
        if(si<ei){
            int mid =si+(ei-si)/2;
            int leftinv=mergesort(arr, si, mid);
            int rightinv=mergesort(arr, mid+1, ei);
            int invcnt = merge(arr,si,mid,ei);
            return leftinv+rightinv+invcnt;
        }
        return 0;
    }
    public static int merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int invcount=0;
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{ //inversion found!
                temp[k]=arr[j];
                j++;
                invcount+=(mid-i+1);
            }
        }
        //leftover
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy to og
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return invcount;
    }

    public static void main(String[] args) {
        int arr[] ={2,3,1,9};
        System.out.println(mergesort(arr, 0, arr.length-1));
    }
}
