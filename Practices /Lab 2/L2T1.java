import java.util.Scanner;

//Task 1 .Write a program to Find the number of days in a month using a switch statement

public class L2T1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (jan-dec): ");
        String month = scanner.nextLine();

        switch (month) {
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
                System.out.println("31 Days");
                break;
            case "apr":
            case "jun":
            case "sep":
            case "nov":
                System.out.println("30 Days");
                break;
            case "feb":
                System.out.println("28/29 Days");
                break;
            default:
                System.out.println("Invalid month");
        }
    }

}
