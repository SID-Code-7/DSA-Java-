package arrlist;

import java.util.*;

public class maxFreq {
    public static int check(ArrayList<Integer> list ,int key){
        int max =0;
        int result =0;
        int count[] = new int[1001];
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == key){
                int target = list.get(i+1);
                count[target]++;
            

            if(count[target] > max){
                max = count[target];
                result = target;
            }
            
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,100,200,1,100));
        int key =1;
        System.out.println(check(list,key));
    }
}
