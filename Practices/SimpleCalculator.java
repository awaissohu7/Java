
import java.util.Scanner;
class SimpleCalculator extends Exception{

    public static void main(String[] args){
        double result=0.0;
   
       
        Scanner sc=new Scanner(System.in);
        char operator=sc.next().charAt(0);
        
        switch (operator) {
            case  '+' :
                System.out.println(5+5);
                break;
        
            case '-': 
                    System.out.println(5-5);
                    break;
           
            case '/':
                    System.out.println(5/5);
                    break;
    
            case '*':
                System.out.println(5*5);
                   break;
        }
    }
}




















































