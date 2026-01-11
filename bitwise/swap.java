package bitwise;
public class swap {
    public static void main(String[] args) {
        int x=5,y=10;
        System.out.println(x+" "+y);
        x=x^y; //15
        y=x^y; // x=15,y=10 => 5
        x=x^y; //x=15,y=5 => 10
        System.out.println(x+" "+y);
    }
}
