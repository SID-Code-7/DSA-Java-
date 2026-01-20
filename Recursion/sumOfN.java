package Recursion;

public class sumOfN {
    public static int sum(int n){
        // base case
        if(n==0){
            return 0;
        }
        int s = n + sum(n-1);
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
