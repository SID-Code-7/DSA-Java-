import java.util.*;
public class incomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        if(income < 500000){
            System.out.println(income);
        }
        else if (income >= 500000 && income<=100000){
            double total = income + (income*0.2);
            System.out.println(total);
        }
        else {
            double total = income+(income*0.3);
            System.out.println(total);
        }
        sc.close();
    }
}
