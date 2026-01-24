package Recursion;

public class length {
    public static int len(String str){
        //base case 
        if(str.length()==0){
            return 0;
        }
        //kaam
        return len(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "sidjuu";
        System.out.print(len(str));
    }
}
