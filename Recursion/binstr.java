package Recursion;

public class binstr {
    public static void bin(int n , int lastplace,String str){
        //base case 
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
        bin(n-1,0, str+"0");
        if(lastplace == 0){
            bin(n-1, 0, str+"1");
        }

    }
    public static void main(String[] args) {
        //print bin string without consecutive 1;
        bin(3, 0, "");
    }
}
