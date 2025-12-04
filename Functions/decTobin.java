package Functions;

public class decTobin {
    public static int dec(int n){
        int rem;
        int output=0;
        int power =0;
        while(n>0){
            rem = n%2;
            output = output + rem* (int)(Math.pow(10,power));
            n = n/2;
            power++;
        }
        return output;
    }
    public static void main(String args[]){
        for(int i =0 ; i<=10; i++){
            System.out.println(dec(i));
        }
    }
}
