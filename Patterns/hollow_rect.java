package Patterns;
public class hollow_rect{
    public static void print(int r, int c){
        //outer loop
        for(int i=1; i<=r;i++){
            //inner loop
            for(int j =1; j<=c; j++){
                if(i==1 || i == r || j==1 || j ==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4,5 );
    }
}
