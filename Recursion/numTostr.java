package Recursion;

public class numTostr {
    static String digit[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void print(int n){
        //base case
        if(n==0){
            return;
        }

        //kaam
        int lastdigit = n%10;
        print(n/10);
        System.out.print(digit[lastdigit]+" ");
    }
    public static void main(String[] args) {
        print(1947);   
    }
}
