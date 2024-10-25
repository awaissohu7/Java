public class SalariedEmployee extends Employee{
    
private double weeklySalary;

public void setWeeklySalary(double weeklySalary) {
    if(weeklySalary < 0) 
    {
       System.err.println("invalid salary");
    }
    else{
        this.weeklySalary = weeklySalary;
    }
}
public double getWeeklySalary() {
    return weeklySalary;
}

SalariedEmployee(double weeklySalary)
{
    super("Awais","Sohu","45205-113310-9");
    this.weeklySalary=weeklySalary;
}
SalariedEmployee()
{

}
@override
public String toString() {
    return "SalariedEmployee    weeklySalary=" + weeklySalary + " " + super.toString();
    
}

    @Override
    public double earning()
    {
       
        return this.weeklySalary;
    }











}
