package Array;

public class frequency {
    public static boolean freq (int arr[]){
        for(int i =0; i< arr.length-1; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr2[] ={1,283,82,1,3,5,5,2};
        System.out.println(freq(arr));
        System.out.println(freq(arr2));
    }
}
