package Patterns;

import java.util.Scanner;

public class pattern3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char count = 'A';
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}