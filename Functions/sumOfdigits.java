package Functions;

public class sumOfdigits {
    public static int sum(int n){
        int rem;
        int digitSum =0;
        while (n>0) {
            rem = n%10;
            digitSum = digitSum+rem;
            n/=10;
        }

        return digitSum;
    }
    public static void main(String[] args) {
        System.out.println(sum(8281));
    }
}
