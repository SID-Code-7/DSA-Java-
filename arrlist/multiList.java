package arrlist;

import java.util.ArrayList;
import java.util.List;

public class multiList{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        //list 1
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        //list 2
        ArrayList<Integer> list2 = new ArrayList<>(List.of(2,4,6,8,10));
        //list 3
        ArrayList <Integer> list3 = new ArrayList<>(List.of(3,6,9,12,15));

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> current = mainlist.get(i);
             for(int j=0; j<current.size();j++){
                System.out.print(current.get(j)+" ");
             }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}