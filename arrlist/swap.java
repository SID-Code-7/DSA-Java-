package arrlist;

import java.util.ArrayList;
import java.util.List;

public class swap {
    public static void swaping(ArrayList<Integer> list , int idx1,int idx3){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx3));
        list.set(idx3,temp);
    }
     public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(List.of(2,5,9,3,6));
    // list.add(2);
    // list.add(5);
    // list.add(9);
    // list.add(3);
    // list.add(6);
    System.out.println(list);
    int idx1 = 1;
    int idx3= 3;
    swaping(list, idx1, idx3);
    System.out.println(list);
  }
}
