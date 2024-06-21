package datastructures.array;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int n = sc.nextInt();
        System.out.print("Enter number of columns :");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }
}
