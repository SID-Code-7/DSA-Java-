package bitwise;

public class pow2 {
    public static void check(int n){
        if((n &(n-1))==0){
            System.out.println("yes power of 2");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        check(9);
        check(8);
    }
}
