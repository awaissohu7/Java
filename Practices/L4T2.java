/*class EmployeeInfo{

int Salary;
int numberofhrs;

 int getinfo(int Salary,int numberofhrs)
{
    return Salary;
}
int addwork()
{
    if(numberofhrs>6)
    {
        numberofhrs+=++5;
    }
}
}


public class L4T2 {
    public static void main(String[] args) {

        EmployeeInfo s1=new EmployeeInfo();
        int a=s1.getinfo(20, 8);
        int b=q2.addwork();

        
        System.out.println(a);


    }

}
 */












 public class EmployeeInfo {
    private int salary;
    private int numberOfHours;

    // Method to get information
    public void getInfo(int salary, int numberOfHours) {
        this.salary = salary;
        this.numberOfHours = numberOfHours;
    }

    // Method to add work hours
    public void addWork() {
        if (numberOfHours > 6) {
            salary += 5; // Add $5 to salary if number of hours is more than 6
        }
    }

    // Method to display the final salary
    public void displaySalary() {
        System.out.println("Final Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        // Create an instance of EmployeeInfo
        EmployeeInfo employee = new EmployeeInfo();

        // Display the initial salary
        System.out.println("Initial Salary: " + employee.salary);

        // Add work hours
        employee.addWork();

        // Display the final salary
        employee.displaySalary();
    }
}
