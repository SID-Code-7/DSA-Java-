package Recursion;

public class firstOcc {
    public static int first(int arr[], int key , int i){
        if(i == arr.length-1){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return first(arr, key, i+1);
    }

    public static int last(int arr[], int key, int i){
        //base case 
        if(i == arr.length){
            return -1;
        }

        int isFound = last(arr, key, i+1);

        if(isFound == -1 && arr[i]==key){
            return i;
        }

        return isFound;
    }

    // all occ
    public static void all(int arr[],int key,int i){
        //base case 
        if(i==arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        all(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] ={2,2,4,5,6,28,19,2,6};
        System.out.println(first(arr, 6, 0));
        System.out.println(last(arr, 6, 0));
        all(arr, 6, 0);
    }   
}
