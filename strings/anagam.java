package strings;

import java.util.Arrays;

public class anagam {
    public static void main(String[] args) {
        String str1 ="race";
        String str2 ="care";
        if(str1.length()==str2.length()){
        char str1arr[] =str1.toCharArray();
        char str2arr[]= str2.toCharArray();

        Arrays.sort(str1arr);
        Arrays.sort(str2arr);
        boolean res = Arrays.equals(str1arr, str2arr);
        if(res == true){
            System.out.println("yes "+str1+" and "+str2+" are  anagam");
        }
        else{
         System.out.println("No "+str1+" and "+str2+" are not anagam");   
        }
    }
    }
}
