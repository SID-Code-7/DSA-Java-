import java.util.*;
public class intSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int sumOdd = 0;
        int sumEven =0;
        do{
            System.out.println("enter the number");
            n=sc.nextInt();
            if(n%2 == 0){
                sumEven+=n;
            }
            else {
                sumOdd+=n;
            }

            System.out.println("enter 1 for continue");
            choice =sc.nextInt();
        }while(choice==1);
        System.out.println("sum of even = "+ sumEven);
        System.out.println("sum of odd = "+sumOdd);
        sc.close();
    }
}
