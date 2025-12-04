package Functions;

public class test {

    public static void printing(){
        System.out.println("hey i am sid");
    }
    public static double avg(int a ,int b, int c){
        double ans =(a+b+c)/3;
        return ans;
    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        printing();
        System.out.println(avg(4, 7, 10));
        System.out.println(isEven(3));
    }
}
