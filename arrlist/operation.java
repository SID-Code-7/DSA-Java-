package arrlist;

import java.util.ArrayList;

public class operation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //syntax
        // operations 
        for(int i=1; i<=10; i++){
            list.add(i); // insert
        }
        System.out.println(list);
        //get 
        System.out.println(list.get(5));
        //delete
        list.remove(3);
        System.out.println(list);

        //set
        list.set(5, 20);
        System.out.println(list);
        //find the element 

        System.out.println(list.contains(10)); //true pr false

        //.size()
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
