package bitwise;

public class oddeven {
    public static void check(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("even no.");
        }
        else{
            System.out.println("odd no.");
        }
    }
    public static void main(String[] args) {
     check(10);   
     check(5);
     check(37);
     check(94);
    }
}
