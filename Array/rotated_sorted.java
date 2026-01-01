package Array;

public class rotated_sorted {
    public static int sort( int arr[], int target){
        int n = arr.length;
        int left =0;
        int right = n-1;
        while (left<=right) {
            int mid = left + (right - left) /2;
            if( arr[mid] == target){
                return mid;
            }

            //check which side is sorted 
            if(arr[ left] <= arr[mid]){  // if left is higer than mid left is not sorted at all
                if(arr[left] <= target && target <=arr[mid]){
                    right = mid-1;
                }
                else {
                    left = mid + 1;
                }
            }

            else{
                if(arr[mid] <= target && target<= arr[right]){
                    left = mid + 1;
                }
                else{
                    right = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,0,1,2};
        int  target = 1;
        System.out.println(sort(arr, target));
    }
}
