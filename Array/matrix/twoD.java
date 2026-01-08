package Array.matrix;

import java.util.Scanner;

public class twoD {
    public static void comp(int[][] arr){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                if(largest<arr[i][j]){
                    largest = arr[i][j];
                }
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n;i++){
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        comp(arr);
        sc.close();
    }
}
