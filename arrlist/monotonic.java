package arrlist;

import java.util.ArrayList;
import java.util.List; 

public class monotonic {
    public static boolean isTrue(ArrayList<Integer> ans){
        int n = ans.size();
        for(int i=0; i<n-1; i++){
            if((ans.get(i) < ans.get(i+1)) || ans.get(i+1) < ans.get(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(6,5,4,4));

        System.out.println(isTrue(list1));
        System.out.println(isTrue(list2));
    }
}
