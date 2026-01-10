package bitwise;

public class ithBit {
    public static int getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitmask =1<<i;
        return (n | bitmask);
    }
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int update(int n, int i, int newBit){
        // if(n==0){
        //     clearIthBit(n, i);
        // }
        // else{
        //     setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return n | bitmask;

    }
    public static int clearIBit(int n , int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearBitRange(int n,int i, int j){
        int a= ((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
     System.out.println(getIthBit(0b1010, 3)); 
     System.out.println(setIthBit(0b1010, 2));
     System.out.println(clearIthBit(10, 1));
     System.out.println(update(10, 2,1));
     System.out.println(clearIBit(15, 2));
     System.out.println(clearBitRange(10, 2, 4));
    }
}
