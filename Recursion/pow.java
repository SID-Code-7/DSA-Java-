package Recursion;

public class pow {
    // public static int power(int x ,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int p = x*power(x, n-1);
    //     return p;
    // }


    //more optamized 
    public static int power(int x ,int n){
        //base case 
        if(n==0){
            return 1;
        }
        int halfpow = power(x, n/2);
        int halfpowSq = halfpow*halfpow;

        if( n%2 != 0){
            halfpowSq = x*halfpowSq;
        }

        return halfpowSq;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
