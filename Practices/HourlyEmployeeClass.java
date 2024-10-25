public class HourlyEmployeeClass extends Employee{
    
private double hours;
private double wage;

public void setHours(double hours) {
    this.hours = hours;
}
public double getHours() {
    return hours;
}

public void setWage(double wage) 
{
    this.wage=wage;    
}
public double getWage() {
    return wage;
}

HourlyEmployeeClass(double hours,double wage)
{
    super("Zaheer","Sohu","45205-113310-9");
    this.hours=hours;
    this.wage=wage;
    
}

@Override
public String toString() {
    return "HourlyEmployeeClass    hours=" + hours +super.toString();
    
}

public double earning()
{
    if(hours<=40)
    {
        return hours*wage;
    }
    else
    {
        return (40*wage) + ((hours-40)*wage*1.5);
    }

}








































}
