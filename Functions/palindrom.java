package Functions;

public class palindrom {
    public static boolean checkPalindrom(int n){
        int rem;
        int m = n;
        int rev=0;
        while(n>0){
            rem = n%10;
            rev = rev*10+ rem;
            n =n/10;
        }
        if(m== rev){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrom(1221));
    }
}
