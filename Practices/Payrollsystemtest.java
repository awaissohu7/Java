public class Payrollsystemtest {
    
 public static void main(String[] args) 
 {

Employee firstEmployee=new SalariedEmployee("Muhammad","Ali","1111111",800.00);

Employee SecondEmployee=new SalariedEmployee("Tarwan","Kumar","2222222",10000,0.06);

Employee ThirdEmployee=new SalariedEmployee("Qudus","ahmed","333333333",5000,0.04,300);

Employee FourthEmployee=new SalariedEmployee("hasnanin","ahmed","444444444",16.75,40);

System.out.println(firstEmployee);
System.out.println(firstEmployee.earnings());
System.out.println(secondEmployee);
System.out.println(secondEmployee.earnings());
System.out.println(thirdEmployee);
BasePlusCommissionEmployee currentEmployee =(BasePlusCommissionEmployee) thirdEmployee;
double oldBaseSalary = currentEmployee.getBaseSalary();
System.out.println( "old base salary: " + oldBaseSalary) ;
currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
System.out.println("new base salary with 10% increase is: "+currentEmployee.getBaseSalary());
System.out.println(thirdEmployee.earnings() );
System.out.println(fourthEmployee);
System.out.println(fourthEmployee.earnings() );

























 }
}

       
























