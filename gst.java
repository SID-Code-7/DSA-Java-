import java.util.*;
public class gst {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float pen = sc.nextFloat();
    float pencile = sc.nextFloat();
    float eraser = sc.nextFloat();

    float totel = pen+pencile+eraser;
    float final_bill = totel+0.18f;
    System.out.println(final_bill);
    sc.close();
    }
}

