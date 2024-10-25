public class BasePlusComissionEmployee  extends ComisssionEmployee
{
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0) {
            System.err.println("Invalid base salary");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public BasePlusComissionEmployee() {
        super();
    }

    public BasePlusComissionEmployee(String firstname, String lastname, String Cnic, double baseSalary, double grossSales, double comissionRate) {
        super(firstname, lastname, Cnic, grossSales, comissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "\nBase plus Commission employee: " + super.toString();
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

}

}
