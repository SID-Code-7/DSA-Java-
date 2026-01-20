package Recursion;

public class tilingprob {
    public static int ways(int n){
        //base case 
        if(n==0 || n==1){
            return 1;
        }

        //vertical
        int v = ways(n-1);
        //horizontal
        int h = ways(n-2);
        int total = v+h;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
