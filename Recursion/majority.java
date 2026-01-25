package Recursion;

public class majority {
    public static int maj(int arr[],int l,int r){
        //base case
        if(arr[l] == arr[r]){
            return arr[l];
        }
        //kaam
        int mid = l+(r-l)/2;
        int leftmaj = maj(arr, 0, mid);
        int rightmaj = maj(arr, mid+1, r);

        if(leftmaj == rightmaj){
            return leftmaj;
        }
        int leftcount = count(arr,leftmaj,l,r);
        int rightcount =count (arr,rightmaj,l,r);
        return leftcount>rightcount ?leftmaj:rightmaj;
    }
    public static int count(int arr[],int target,int l,int r){
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1,29,29,38,2,2,2,1,2,29};
        System.out.println(maj(arr, 0, arr.length-1));
    }
}
