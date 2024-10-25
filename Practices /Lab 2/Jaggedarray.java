import java.util.Scanner;
//Task 6. Write a Java program that takes a jagged array as input and finds the maximum element of array and Display it.
public class Jaggedarray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of jagged array: ");
        int n = sc.nextInt();

        int[][] jaggedArray = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of columns of row " + (i + 1) + ": ");
            int m = sc.nextInt();
            jaggedArray[i] = new int[m];
            System.out.println("Enter elements of row " + (i + 1) + ": ");
            for (int j = 0; j < m; j++)
                jaggedArray[i][j] = sc.nextInt();
        }

        int max = jaggedArray[0][0];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < jaggedArray[i].length; j++)
                if (jaggedArray[i][j] > max)
                    max = jaggedArray[i][j];

        System.out.println("The maximum element in the jagged array is: " + max);
    }



}
