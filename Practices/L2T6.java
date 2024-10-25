import java.util.Scanner;

public class L2T6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sub-arrays: ");
        //int numberOfArrays = scan.nextInt();

        // Declare the jagged array
        int[][] jaggedArray = new int[2][];

        // Allocate memory to each sub-array
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfSubArray = scan.nextInt();
            jaggedArray[i] = new int[sizeOfSubArray];
        }

        // Initialize the elements of each sub-array
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter elements of sub-array " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = scan.nextInt();
            }
        }

        // Find the maximum element in each sub-array
        int maxInSubArray = Integer.MIN_VALUE;
        for (int i = 0; i < 2; i++) {
            int max = jaggedArray[i][0];
            for (int j = 1; j < jaggedArray[i].length; j++) {
                if (jaggedArray[i][j] > max) {
                    max = jaggedArray[i][j];
                }
            }
            if (max > maxInSubArray) {
                maxInSubArray = max;
            }
        }

        // Display the overall maximum element
        System.out.println("The overall maximum element in the jagged array is: " + maxInSubArray);
        scan.close();
    }
}
