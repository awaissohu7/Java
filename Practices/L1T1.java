import java.util.Scanner;

public class L1T1{
public static void main(String[] args) {
    

    //write a program to Find the number of days in a month using a switch statement

            

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
                
       
            }
}
}
    
    
