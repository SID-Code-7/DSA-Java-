package Functions;

public class binTodec {
    public static void main(String args[]){
        int n =1111;
        int power =0;
        int output =0;
        while (n>0) {
            int rem = n%10;
            output = (int) (output+rem*Math.pow(2,power));
            n=n/10;
            power++;
        }
        System.out.println(output);
    }
}
