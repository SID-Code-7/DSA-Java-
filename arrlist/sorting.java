package arrlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(2,4,18,22,41,12));
        System.out.println(list);
        // in array => Array.sort(arr);
        Collections.sort(list); //incr
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder()); //dec
        System.out.println(list);
    }
}
