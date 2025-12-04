package Functions;
public class binomial {
    public static int fact(int a){
    int fact =1;
    for (int i =1 ; i<=a; i++){
        fact = fact*i;
    }
    return fact;
}
    public static int bin(int c,int d){
        int n = fact(c);
        int r = fact(d);
        int diff= fact(c-d);
        int res = n/(r*diff);
        return res;
    }

    public static void main(String args[]){
        System.out.println(bin(4,2));
    }
}
