package Array;
import java.util.*;

// class test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];
//         for(int i =0; i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i =0; i< arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         sc.close();
//     }
// }

// optimize bubble sort
class BubbleSort{
    public static void sort(int[] arr){
        int n = arr.length;
        int count =0;
        for(int i =0; i<n-1; i++){
            boolean swap = false;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                    count++;
                }
            }
            if(swap == false){
                break;
            }   
        }
        System.out.println(count);
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,11,3,81,29};
        sort(arr);
    }
}