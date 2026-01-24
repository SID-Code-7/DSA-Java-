package Recursion;

public class freinds{
    public static int ways(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }

        //kaam
        int single = ways(n-1);
        int pair = (n-1)*ways(n-2);
        int total = single + pair;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(ways(3));
    }
 }