package arrlist;

import java.util.ArrayList;
import java.util.List;

public class pairsum1 {
    //brute force approch
    // public static void check(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size();i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i)+list.get(j) == target){
    //                 System.out.println(list.get(i)+" "+ list.get(j));
    //             }
    //         }
    //     }
    // }
     


    // 2 pointer
    public static boolean check(ArrayList<Integer> list, int target){
        int left=0;
        int right = list.size()-1;
        while(left<right){
            if(list.get(left) + list.get(right) == target){
                return true;
            }
            
            else if(list.get(left)+ list.get(right) < target){
                left++;
            }
            else {
                right--;
            }
        }
         return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6));
        int target=5;
        System.out.println(check(list,target));
    }
}
