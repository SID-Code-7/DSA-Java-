package Recursion;

public class TowerOfHanoi {
    public static void toi(int n,String src,String helper,String dest){
        //base case 
        if(n==1){
            System.out.println("transfer disk "+n+" form "+src+" to "+dest);
            return;
        }

        //kaam
        //src to hlper using dest as helper
        toi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from " +src +" to "+dest);
        //helper to dest using src as helper
        toi(n-1, helper, src, dest);

    }
    public static void main(String[] args) {
        toi(2, "A", "B", "C");
    }
}
