package Recursion;

public class factorial {

    public static int fact(int n){
        // base case 
        if( n==0){
            return 1;
        }
        int f = n*fact(n-1);
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
