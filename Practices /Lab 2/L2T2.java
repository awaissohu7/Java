import java.util.Scanner;

//Task 2. Write a program to check whether the number is even or odd using switch statement.


public class L2T2 {
    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();

        switch (a % 2) {

            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
                break;
        }

        sc.close();
    }

}
