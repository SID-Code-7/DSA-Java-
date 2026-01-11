package bitwise;

public class addOne {
    public static int addone(int x){
        return -~x;
    }
    public static void main(String[] args) {
        System.out.println(addone(10));
    }
}
