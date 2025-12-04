import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =10;
        int b=46;
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
            default: System.out.println("invalid");
                break;
        }
        sc.close();
    }
}
