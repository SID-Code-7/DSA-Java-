package arrlist;

import java.util.*;

public class mostWater{
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>(List.of(1,8,6,2,5,4,8,3,7));
        int max=0;
        int currarea=0;

        //brute force
        // for(int i=0; i<heights.size(); i++){
        //     for(int j=i+1; j<heights.size(); j++){
        //         int width = j-i;
        //         int height = Math.min(heights.get(i),heights.get(j));
        //         currarea= width*height;
        //     }
        //     max = Math.max(max, currarea);
        // }
        // System.out.println(max);


        //optimal - 2ptr approch

        int left =0;
        int right = heights.size()-1;

        while(left<=right){
            int ht = Math.min(heights.get(left), heights.get(right));
            int width = right -left;
            currarea = ht*width;
            max = Math.max(currarea, max);
            if(heights.get(left)< heights.get(right)){
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(max);
    }
}