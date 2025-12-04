package Functions;

public class primeRange {
    public static boolean isPrime(int n){
        
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void range(int n){
         for(int i =2 ; i<=n; i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
         }
    }

    public static void main(String args[]){
         range(20);
    }
}
