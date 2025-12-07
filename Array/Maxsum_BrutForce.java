package Array;

public class Maxsum_BrutForce {
    public static void  Max(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            int start =i;
            for(int j =i;j<arr.length; j++){
                int end =j;
                int currsum =0;
                for(int k =start; k<=end; k++){
                    currsum+=arr[k];
                }
                System.out.println(" sum is = "+currsum);
                if(largest<currsum){
                    largest=currsum;
                }
            }
        }
        System.out.println("max sum is = "+largest);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Max(arr);
    }
}
