package bitwise;

public class countSetBit {
    public static int check(int n){
        int count =0;
        int bitmask = 1;
        while(n>0){
            if((n & bitmask) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(check(10));
    }
}
