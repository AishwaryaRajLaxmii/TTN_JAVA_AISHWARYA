package mulitdimensionalarray;

import java.util.Scanner;

public class ArraySum {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c= sc.nextInt() ;

        int arr[][]=new int[r][c];

//        input values from user
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

//        sum of rows
        System.out.println("\nRows Sums:");
        for(int i=0;i<r;i++){
            int rowSum=0;
            for(int j=0;j<c;j++){
                rowSum+=arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);

        }
//        sum of cols
        System.out.println("\nColumn Sums:");
        for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }

    }
}

