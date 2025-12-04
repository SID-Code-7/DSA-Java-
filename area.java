import java.util.Scanner;
public class area{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println(area);
        sc.close();
    }
}
