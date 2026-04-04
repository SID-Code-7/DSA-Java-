package arrlist;

import java.util.*;

public class lonely {
    public static ArrayList<Integer> check(ArrayList<Integer> list){
        int n = list.size();
        Collections.sort(list);
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=0; i<n;i++){
            if((i == 0 || list.get(i) - list.get(i-1)>1) && (i == n-1 || list.get(i+1) - list.get(i) >1)){
                ans.add(list.get(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10,6,5,8));
        System.out.println(check(list));
    }
}
