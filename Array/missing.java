package Array;
public class missing {
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,6,7,8,9,10};
        int Nsum=0;
        int arrSum=0;
        for(int i=0;i<arr.length; i++){
            arrSum+=arr[i];
        }

        for(int i=1; i<=10; i++){
            Nsum+=i;
        }
        int miss = Nsum-arrSum;
        System.out.println("Missing element is = "+miss);
    }
}
