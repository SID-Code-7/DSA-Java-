package Patterns;

public class Rhombus {
    public static void print(int n ){
        //outer 
        for(int i =1; i<=n; i++){
            //spaces
            for(int j =1 ; j<=n-i; j++){
                System.out.print(" ");
            }

            // star
            for(int j =1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4);
    }
}
