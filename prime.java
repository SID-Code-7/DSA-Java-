import java.util.*;
public class prime {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n==2){
        System.out.println("yes it is a prime no.");
    }
    else {
        boolean isPrime = true;
    
    for(int i = 2 ; i<=Math.sqrt(n); i++){
        if(n%i == 0){
            isPrime = false;
            System.out.println("not prime");
            break;
        }
    }

    if(isPrime == true){
        System.out.println("yes it is prime");
    }
    }
    sc.close();
    }
}
